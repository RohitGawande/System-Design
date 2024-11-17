class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Hello from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.greet();   // Output: Hello from Parent
        child.display(); // Output: Hello from Child
    }
}