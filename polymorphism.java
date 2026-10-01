// Base class for Runtime Polymorphism
class Shape {
    void draw() {
        System.out.println("Drawing a generic shape");
    }
}

// Subclass overriding the draw method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Demonstrating Method Overloading inside the calculator helper
class Calculator {
    // Overloaded method: adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method: adds three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method: adds two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class named 'polymorphism'
public class polymorphism {
    public static void main(String[] args) {
        // 1. COMPILE-TIME POLYMORPHISM (Method Overloading)
        System.out.println("--- Compile-Time Polymorphism ---");
        Calculator calc = new Calculator();
        System.out.println("add(5, 10)       -> " + calc.add(5, 10));
        System.out.println("add(5, 10, 15)   -> " + calc.add(5, 10, 15));
        System.out.println("add(2.5, 3.5)    -> " + calc.add(2.5, 3.5));

        // 2. RUNTIME POLYMORPHISM (Method Overriding / Dynamic Method Dispatch)
        System.out.println("\n--- Runtime Polymorphism ---");
        Shape myShape; // Superclass reference

        myShape = new Shape();
        myShape.draw(); // Calls Shape's draw()

        myShape = new Circle(); 
        myShape.draw(); // Calls Circle's overridden draw() at runtime
    }
}
