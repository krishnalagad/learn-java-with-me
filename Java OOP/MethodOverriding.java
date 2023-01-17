abstract class Parent {
    protected void print() {
        System.out.println("Parent class method..");
    }
}

class Child extends Parent {
    public void print() {
        System.out.println("Child class method..");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.print();
    }
}
