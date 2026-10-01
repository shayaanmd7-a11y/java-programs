import java.util.LinkedList;

// 1. CUSTOM LINKED LIST IMPLEMENTATION
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CustomLinkedList {
    Node head;

    // Add node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Display the custom linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// 2. MAIN CLASS
public class linkedlist {
    public static void main(String[] args) {
        // --- CUSTOM LINKED LIST ---
        System.out.println("--- Custom Linked List ---");
        CustomLinkedList customList = new CustomLinkedList();
        customList.insert(10);
        customList.insert(20);
        customList.insert(30);
        customList.display();

        System.out.println("\n---------------------------\n");

        // --- JAVA BUILT-IN LINKEDLIST ---
        System.out.println("--- Java's java.util.LinkedList ---");
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Node 1");
        list.add("Node 2");
        list.addFirst("Head Node");  // Insert at start
        list.addLast("Tail Node");   // Insert at end

        System.out.println("Current List: " + list);

        // Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: "  + list.getLast());

        // Remove elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing Head & Tail: " + list);

        // Iterate through items
        System.out.println("\nIterating over elements:");
        for (String item : list) {
            System.out.println("- " + item);
        }
    }
}
