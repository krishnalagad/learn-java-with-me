import java.util.*;

public class Graph {
    private LinkedList<Integer> adj[];

    /**
     * @param v
     */
    public Graph(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    /**
     * @param source
     * @param destination
     */
    public void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    /**
     * @param source
     * @param destination
     * @return
     */
    public int bfs(int source, int destination) {
        boolean vis[] = new boolean[adj.length];
        int parent[] = new int[adj.length]; // this array keeps track of which node introduced which node.

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(source);
        parent[source] = -1; // No node introduced source, so make it -1.
        vis[source] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();
            if (cur == destination)
                break;

            for (int neighbor : adj[cur]) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                    parent[neighbor] = cur;
                }
            }
        }

        int cur = destination;
        int distance = 0;
        while (parent[cur] != -1) {
            System.out.print(cur + " -> ");
            cur = parent[cur];
            distance++;
        }
        System.out.println(cur);

        return distance;
    }

    /**
     * @param source
     * @param destination
     * @param vis
     * @return
     */
    private boolean dfsUtil(int source, int destination, boolean vis[]) {
        if (source == destination)
            return true;

        for (int neighbor : adj[source]) {
            if (!vis[neighbor]) {
                vis[neighbor] = true;
                boolean isConnected = dfsUtil(neighbor, destination, vis);
                if (isConnected)
                    return true;
            }
        }

        return false;
    }

    /**
     * @param source
     * @param destination
     * @return
     */
    public boolean dfsStack(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(source);

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (cur == destination) {
                return true;
            }
            for( int neighbor: adj[cur]){
                if(!vis[neighbor]){
                    vis[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
        return false;
    }

    /**
     * @param source
     * @param destination
     * @return
     */
    public boolean dfs(int source, int destination){
        boolean vis[] = new boolean[adj.length];
        vis[source] = true;

        return dfsUtil(source, destination, vis);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter total number of vertices: ");
            int v = sc.nextInt();

            System.out.print("Enter total number of edges: ");
            int e = sc.nextInt();
            System.out.println();

            Graph graph = new Graph(v + 1);

            System.out.println("Enter source & destination of total " + e + " edges :");
            for (int i = 0; i < e; i++) {
                System.out.print("Enter source of edge " + (i + 1) + " : ");
                int source = sc.nextInt();

                System.out.print("Enter destination of edge " + (i + 1) + " : ");
                int destination = sc.nextInt();
                System.out.println();

                graph.addEdge(source, destination);
            }

            System.out.print("Enter source : ");
            int source = sc.nextInt();

            System.out.print("Enter destination : ");
            int destination = sc.nextInt();
            System.out.println();

            int distance = graph.bfs(source, destination);
            System.out.println("Minimum distance : " + distance);

            System.out.println();
            String result = graph.dfs(source, destination) ? "Path Found" : "Path Not Found";
            System.out.println(result);
        }

    }
}
