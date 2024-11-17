class Calculator {
    // Overloaded methods for addition
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));           // Output: 5
        System.out.println(calc.add(2.5, 3.5));      // Output: 6.0
        System.out.println(calc.add("Hello ", "World")); // Output: Hello World
    }
}