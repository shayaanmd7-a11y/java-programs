import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

// 1. CUSTOM HASHSET IMPLEMENTATION (Using Chaining for Collisions)
class CustomHashSet {
    private static final int SIZE = 10;
    private LinkedList<Integer>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashSet() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getHash(int key) {
        return Math.abs(key) % SIZE;
    }

    // Add unique element
    public boolean add(int key) {
        int index = getHash(key);
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
            return true;
        }
        return false; // Duplicate key
    }

    // Check presence
    public boolean contains(int key) {
        int index = getHash(key);
        return buckets[index].contains(key);
    }

    // Display elements
    public void display() {
        System.out.print("Custom HashSet elements: ");
        for (LinkedList<Integer> bucket : buckets) {
            for (int key : bucket) {
                System.out.print(key + " ");
            }
        }
        System.out.println();
    }
}

// 2. MAIN CLASS
public class hashset {
    public static void main(String[] args) {
        // --- CUSTOM HASHSET ---
        System.out.println("--- Custom HashSet Implementation ---");
        CustomHashSet chs = new CustomHashSet();
        chs.add(10);
        chs.add(20);
        chs.add(10); // Duplicate - ignored
        chs.add(30);
        chs.display();
        System.out.println("Contains 20? " + chs.contains(20));

        System.out.println("\n-----------------------------------\n");

        // --- JAVA BUILT-IN HASHSET ---
        System.out.println("--- Java's java.util.HashSet ---");
        HashSet<String> cities = new HashSet<>();

        // 1. Add elements (Duplicates will be rejected)
        cities.add("Bengaluru");
        cities.add("New York");
        cities.add("Tokyo");
        boolean isAdded = cities.add("Bengaluru"); // Returns false because "Bengaluru" exists

        System.out.println("HashSet: " + cities);
        System.out.println("Was duplicate 'Bengaluru' added? " + isAdded);

        // 2. Check existence & size
        System.out.println("Contains 'Tokyo'? " + cities.contains("Tokyo"));
        System.out.println("Size of set: " + cities.size());

        // 3. Remove element
        cities.remove("New York");
        System.out.println("After removing 'New York': " + cities);

        // 4. Iterating over HashSet
        System.out.println("\nIterating using Enhanced For-Loop:");
        for (String city : cities) {
            System.out.println("- " + city);
        }

        // 5. Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println("-> " + iterator.next());
        }

        // Clear all elements
        cities.clear();
        System.out.println("\nIs HashSet empty after clear()? " + cities.isEmpty());
    }
}