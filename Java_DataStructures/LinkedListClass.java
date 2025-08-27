public class LinkedListClass {
    static Node head = null;
    static int size;

    public LinkedListClass(){
        this.size = 0;
    }

    static class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public static void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public static void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currNode = head;
        System.out.println();
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
        }
        size--;
        head = head.next;
    }

    public static void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static int getSize(){
        return size;
    }

    // 1. Iterative way
    public static void reverseIterate(){
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // 2. Recursive way
    public static Node reverseRecursive(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

    public static Node removeNthFromEnd(Node head, int n){
        if(head.next == null){
            return null; 
        }

        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n == size){
            head = head.next;
            return head;
        }

        int preOfNthNode = size - n;
        Node prev = head;
        int i = 1;
        while(i < preOfNthNode){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return head;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
        LinkedListClass.addFirst("Krishna");
        LinkedListClass.addFirst("is");
        LinkedListClass.addFirst("my");
        LinkedListClass.addFirst("name");
        LinkedListClass.addLast("last");
        // printList();
        // LinkedListClass.removeFirst();

        LinkedListClass.printList();

        LinkedListClass.reverseIterate();
        LinkedListClass.printList();

        LinkedListClass.head = reverseRecursive(LinkedListClass.head);
        printList();
        
        System.out.println();
        System.out.println(LinkedListClass.getSize());

        System.out.println();
        printList();
        head = removeNthFromEnd(head, 5);
        printList();
    }
}
