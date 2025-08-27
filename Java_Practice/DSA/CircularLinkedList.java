package DSA;

public class CircularLinkedList {
    Node head;
    Node tail;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void createCircularLinkedList(int[] arr) {
        if (arr.length == 0) {
            System.out.println("No data found to create circular linked list");
            return;
        }
        head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            tail = new Node(arr[i]);
            current.next = tail;
            current = current.next;
        }
        tail.next = head;
    }

    void createSinglyLinkedList() {
        if (head == null) {
            System.out.println("Empty circular linked list");
            return;
        }
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        current.next = null;
    }

    void displayCircularLinkedList() {
        if (head == null) {
            System.out.println("Empty circular linked list");
            return;
        }
        Node current = head;
        while (current.next != head) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print(current.data);

        // Check the tail node pointing to head or not.
        if (tail.next != null) {
            Node checkHead = tail.next;
            System.out.println("\n" + checkHead.data);
        }
    }

    void displaySinglyLinkedList() {
        if (head == null) {
            System.out.println("Empty circular linked list");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        CircularLinkedList list = new CircularLinkedList();
        list.createCircularLinkedList(arr);
        list.displayCircularLinkedList();

        list.createSinglyLinkedList();
        list.displaySinglyLinkedList();
    }


}
