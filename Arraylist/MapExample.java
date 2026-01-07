import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("IN", "India");                // Add entry
        map.put("US", "USA");
        map.putIfAbsent("FR", "France");        // Add if absent

        System.out.println(map.get("IN"));       // Get value
        System.out.println(map.getOrDefault("DE", "Default")); // Get or default

        map.remove("US");                        // Remove by key
        map.remove("FR", "France");              // Remove only if value matches

        map.replace("IN", "India Updated");      // Replace value
        map.replace("IN", "India Updated", "Bharat"); // Conditional replace

        System.out.println(map.containsKey("IN")); // Check key existence
        System.out.println(map.containsValue("Bharat")); // Check value existence

        System.out.println(map.size());           // Size of map
        System.out.println(map.isEmpty());        // Check if map is empty

        Set<String> keys = map.keySet();          // Get all keys
        Collection<String> values = map.values(); // Get all values
        Set<Map.Entry<String, String>> entries = map.entrySet(); // Get key-value pairs

        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        for (String value : values) {
            System.out.println("Value: " + value);
        }

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println(k + ": " + v)); // Lambda forEach

        map.clear(); // Clear the map
    }
}