import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClassCollection {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new PriorityQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
