public class DoublyLinkedListClass {

    private static Node head;

    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, DoublyLinkedListClass.Node next, DoublyLinkedListClass.Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public static void addLast(int data){
        Node node = new Node(data);
        if(head == null) {
            System.out.println("Empty linked list");
            head = node;
            return;
        }

        Node raw = head;
        while (raw.next != null) {
            raw = raw.next;
        }

        node.next = null;
        raw.next = node;
        node.prev = raw;
    }

    public static void printListForward(){
        if(head == null){
            System.out.println("Empty doubly linked list");
            return;
        }
        Node node = head;
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void printListBackward() {
        if (head == null) {
            System.out.println("Empty doubly linked list");
            return;
        }
        Node node = head;
        while(node.next != null) {
            node = node.next;
        }

        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.prev;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListClass.addFirst(10);
        DoublyLinkedListClass.addFirst(20);
        DoublyLinkedListClass.addFirst(30);
        DoublyLinkedListClass.addFirst(40);
        DoublyLinkedListClass.addLast(50);
        DoublyLinkedListClass.addLast(60);

        DoublyLinkedListClass.printListForward();
        DoublyLinkedListClass.printListBackward();
    }
}
