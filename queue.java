import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

// 1. CUSTOM QUEUE IMPLEMENTATION (FIFO - First In, First Out)
class CustomQueue {
    private int[] arr = new int[5];
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    // Add item to queue (Enqueue)
    public void enqueue(int data) {
        if (size == arr.length) {
            System.out.println("Queue is full!");
            return;
        }
        arr[rear] = data;
        rear = (rear + 1) % arr.length;
        size++;
    }

    // Remove item from queue (Dequeue)
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return removed;
    }

    // View front item
    public int peek() {
        return (size == 0) ? -1 : arr[front];
    }

    public void display() {
        System.out.print("Custom Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }
}

// 2. MAIN CLASS
public class queue {
    public static void main(String[] args) {
        // --- CUSTOM QUEUE ---
        System.out.println("--- Custom Queue Implementation ---");
        CustomQueue cq = new CustomQueue();
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();

        System.out.println("Dequeued: " + cq.dequeue());
        System.out.println("Front Element: " + cq.peek());
        cq.display();

        System.out.println("\n-----------------------------------\n");

        // --- JAVA BUILT-IN QUEUE INTERFACE ---
        System.out.println("--- Java's java.util.Queue ---");
        
        // Queue is an interface, usually implemented using LinkedList or ArrayDeque
        Queue<String> line = new LinkedList<>();

        // Enqueue: add() or offer()
        line.offer("Alice");
        line.offer("Bob");
        line.offer("Charlie");
        line.offer("David");

        System.out.println("Current Queue: " + line);

        // Peek: element() or peek() - look at front element without removing
        System.out.println("Front person in line: " + line.peek());

        // Dequeue: remove() or poll() - retrieve and remove the front element
        System.out.println("Served (removed): " + line.poll());
        System.out.println("Served (removed): " + line.poll());

        System.out.println("Queue after serving: " + line);
        System.out.println("Next to be served: " + line.peek());

        // Check if queue is empty
        System.out.println("Is queue empty? " + line.isEmpty());
    }
}
