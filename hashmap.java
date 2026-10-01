import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

// 1. CUSTOM HASHMAP IMPLEMENTATION (Using Chaining for Collisions)
class Entry<K, V> {
    K key;
    V value;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class CustomHashMap<K, V> {
    private static final int CAPACITY = 10;
    private LinkedList<Entry<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode()) % CAPACITY;
    }

    // Insert or update key-value pair
    public void put(K key, V value) {
        int index = getHash(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Update existing key
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value)); // Insert new key
    }

    // Retrieve value by key
    public V get(K key) {
        int index = getHash(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void display() {
        System.out.print("Custom HashMap: ");
        for (LinkedList<Entry<K, V>> bucket : buckets) {
            for (Entry<K, V> entry : bucket) {
                System.out.print("[" + entry.key + "=" + entry.value + "] ");
            }
        }
        System.out.println();
    }
}

// 2. MAIN CLASS
public class hashmap {
    public static void main(String[] args) {
        // --- CUSTOM HASHMAP ---
        System.out.println("--- Custom HashMap Implementation ---");
        CustomHashMap<String, Integer> chm = new CustomHashMap<>();
        chm.put("Alice", 90);
        chm.put("Bob", 85);
        chm.put("Alice", 95); // Overwrites previous value for "Alice"
        chm.display();
        System.out.println("Alice's score: " + chm.get("Alice"));

        System.out.println("\n-----------------------------------\n");

        // --- JAVA BUILT-IN HASHMAP ---
        System.out.println("--- Java's java.util.HashMap ---");
        HashMap<String, Integer> studentScores = new HashMap<>();

        // 1. Put key-value pairs
        studentScores.put("John", 78);
        studentScores.put("Emma", 92);
        studentScores.put("Liam", 88);
        
        // Updating existing key replaces old value
        studentScores.put("John", 84); 

        System.out.println("HashMap: " + studentScores);

        // 2. Get values and check existence
        System.out.println("Emma's Score: " + studentScores.get("Emma"));
        System.out.println("Contains key 'Liam'? " + studentScores.containsKey("Liam"));
        System.out.println("Contains value 100? " + studentScores.containsValue(100));

        // 3. putIfAbsent & getOrDefault
        studentScores.putIfAbsent("Emma", 99); // Will NOT update because "Emma" exists
        studentScores.putIfAbsent("Sophia", 91); // Will insert because "Sophia" is absent
        System.out.println("Score for 'Noah' (default fallback): " + studentScores.getOrDefault("Noah", 0));

        // 4. Remove entries
        studentScores.remove("Liam");
        System.out.println("After removing 'Liam': " + studentScores);

        // 5. Iterating through Map Entries
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("- " + entry.getKey() + " : " + entry.getValue());
        }

        // 6. Iterating through Keys or Values
        System.out.println("\nKeys in map: " + studentScores.keySet());
        System.out.println("Values in map: " + studentScores.values());

        // Clear map
        studentScores.clear();
        System.out.println("\nIs HashMap empty after clear()? " + studentScores.isEmpty());
    }
}
