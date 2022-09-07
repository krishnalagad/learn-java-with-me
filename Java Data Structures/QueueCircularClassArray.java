public class QueueCircularClassArray {
    static class CircularQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        CircularQueue(int size) {
            arr = new int[size];
            CircularQueue.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return ((rear + 1) % size) == front;
        }

        // Enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full queue");
                return;
            }
            // 1st element added to queue
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Front
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {

        new CircularQueue(5);

        CircularQueue.add(1);
        CircularQueue.add(2);
        CircularQueue.add(3);
        CircularQueue.add(4);
        CircularQueue.add(5);
        System.out.println(CircularQueue.remove());

        CircularQueue.add(6);
        System.out.println(CircularQueue.remove());
        
        CircularQueue.add(7);
        CircularQueue.add(8);
        System.out.println();

        while (!CircularQueue.isEmpty()) {
            System.out.print(CircularQueue.peek() + " ");
            CircularQueue.remove();
        }
    }
}
