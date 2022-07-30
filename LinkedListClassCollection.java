import java.util.LinkedList;

public class LinkedListClassCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("Krishna");
        list.add("is");
        list.add("my");
        list.addLast("name");
        list.addFirst("raw");
        list.addLast("raw2");
        list.remove();
        list.removeFirst();
        list.removeLast();

        System.out.println(list);
        System.out.println(list.size());
        for(String str: list){
            System.out.print(str + " -> ");
        }
        System.out.println("null");
    }
}
