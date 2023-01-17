abstract class Parent {
    protected Object print() {
        System.out.println("Parent class method..");
        return "";
    }
}

class Child extends Parent {
    public String print() {
        System.out.println("Child class method..");
        return "";
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
    }
}
