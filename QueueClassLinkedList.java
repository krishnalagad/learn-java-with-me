public class QueueClassLinkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // Enqueue
        public static void add(int data) {
            Node newNode = new Node(data);
            if(tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        // Front
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
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