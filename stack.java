import java.util.Stack;

// 1. CUSTOM STACK IMPLEMENTATION (LIFO - Last In, First Out)
class CustomStack {
    private int[] arr = new int[5];
    private int top = -1;

    // Push item onto the stack
    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        arr[++top] = data;
    }

    // Pop item from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return arr[top--];
    }

    // Peek top element
    public int peek() {
        return (top == -1) ? -1 : arr[top];
    }

    public void display() {
        System.out.print("Custom Stack (bottom to top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// 2. MAIN CLASS
public class stack {
    public static void main(String[] args) {
        // --- CUSTOM STACK ---
        System.out.println("--- Custom Stack Implementation ---");
        CustomStack cs = new CustomStack();
        cs.push(10);
        cs.push(20);
        cs.push(30);
        cs.display();

        System.out.println("Popped: " + cs.pop());
        System.out.println("Top Element (peek): " + cs.peek());
        cs.display();

        System.out.println("\n-----------------------------------\n");

        // --- JAVA BUILT-IN STACK ---
        System.out.println("--- Java's java.util.Stack ---");
        Stack<String> bookStack = new Stack<>();

        // Push: Add items to top of stack
        bookStack.push("Java Basics");
        bookStack.push("Data Structures");
        bookStack.push("Algorithms");

        System.out.println("Current Stack: " + bookStack);

        // Peek: View top element without removing
        System.out.println("Top Book (peek): " + bookStack.peek());

        // Pop: Remove and return top element
        System.out.println("Popped Book: " + bookStack.pop());
        System.out.println("Stack after pop: " + bookStack);

        // Search: Find 1-based position from the top
        int position = bookStack.search("Java Basics");
        System.out.println("1-based position of 'Java Basics' from top: " + position);

        // Check if stack is empty
        System.out.println("Is stack empty? " + bookStack.isEmpty());
    }
}