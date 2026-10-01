import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        System.out.println("--- 1. Adding Elements ---");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);

        System.out.println("\n--- 2. Accessing & Modifying Elements ---");
        // Get element at index 1
        System.out.println("Element at index 1: " + fruits.get(1));

        // Update element at index 2
        fruits.set(2, "Grapes");
        System.out.println("After setting index 2 to 'Grapes': " + fruits);

        System.out.println("\n--- 3. Checking Size & Search ---");
        System.out.println("Total fruits in list: " + fruits.size());
        System.out.println("Does list contain 'Apple'? " + fruits.contains("Apple"));

        System.out.println("\n--- 4. Removing Elements ---");
        // Remove by value
        fruits.remove("Banana");
        // Remove by index
        fruits.remove(0); 
        System.out.println("After removing 'Banana' and index 0: " + fruits);

        System.out.println("\n--- 5. Sorting & Iterating ---");
        fruits.add("Cherry");
        fruits.add("Kiwi");
        
        // Sort alphabetically
        Collections.sort(fruits);
        System.out.println("Sorted list: " + fruits);

        // Iterate through elements using enhanced for loop
        System.out.println("Iterating over items:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("\nIs list empty after clear()? " + fruits.isEmpty());
    }
}
