public class StackClassLinkedList{
    // Each node
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;    // it is same as insertion of node ast beginning of linked list.
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);  // 1st in element.
        s.push(2);  // 2nd in element.
        s.push(3);  // 3rd in element.
        s.push(4);  // last in element.
        System.out.println("Stack using Linked List");
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
