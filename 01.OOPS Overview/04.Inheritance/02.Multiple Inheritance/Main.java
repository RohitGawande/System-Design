class GrandParent {
    void legacy() {
        System.out.println("Legacy from GrandParent");
    }
}

class Parent extends GrandParent {
    void wisdom() {
        System.out.println("Wisdom from Parent");
    }
}

class Child extends Parent {
    void energy() {
        System.out.println("Energy from Child");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.legacy(); // Output: Legacy from GrandParent
        child.wisdom(); // Output: Wisdom from Parent
        child.energy(); // Output: Energy from Child
    }
}