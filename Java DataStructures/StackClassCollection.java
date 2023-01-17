import java.util.Stack;

public class StackClassCollection {

    // method to push element at the bottom of the stack
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // method to reverse the stack
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverse(s);
        System.out.println("Stack using Collection");

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
