import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeClass {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Preorder traversal of Binary Tree
    public static void preorder(Node root) {
        if (root == null) {
            // System.out.println("-1 ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder traversal of binary tree
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Post-order traversal of binary tree
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Lavel order traversal of binary tree
    public static void lavelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodeData(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = sumOfNodeData(root.left);
        int rightSum = sumOfNodeData(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return (Math.max(leftHeight, rightHeight) + 1);
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    static class TreeInfo {
        int ht;
        int diam;

        public TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(myHeight, myDiam);
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }

        return false;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);

        System.out.println();
        preorder(root);

        System.out.println();
        inorder(root);

        System.out.println();
        postorder(root);

        System.out.println();
        lavelOrder(root);

        System.out.println();
        System.out.println("Count of nodes: " + countOfNodes(root));

        System.out.println();
        System.out.println("Sum of Node value: " + sumOfNodeData(root));

        System.out.println();
        System.out.println("Height of Binary Tree: " + height(root));

        System.out.println();
        System.out.println("Diameter of Binary Tree '[O(n^2)]' : " + diameter(root));

        System.out.println();
        System.out.println("Diameter of Binary Tree '[O(n)]' : " + diameter2(root).diam);

        System.out.println();
        System.out.println("Checking Subtree");
        int subNodes[] = { 1, 2, 4, -1, -1 };
        Node subRoot = BinaryTree.buildTree(subNodes);

        System.out.println();
        lavelOrder(root);
        System.out.println();
        lavelOrder(subRoot);

        System.out.println();
        System.out.println("Is subRoot sub tree of root : " + isSubTree(root, subRoot));
    }
}
