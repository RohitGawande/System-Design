class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        super(); // Calls the Parent class constructor
        System.out.println("Child constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        new Child();
        // Output:
        // Parent constructor called
        // Child constructor called
    }
}