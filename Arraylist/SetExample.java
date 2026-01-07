import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("A");                           // Add element
        set.add("B");
        set.add("A");                           // Duplicate, will not be added

        set.remove("B");                        // Remove element

        Set<String> temp = new HashSet<>(Arrays.asList("A", "C"));
        set.addAll(temp);                        // Add all elements from another set

        set.removeAll(Arrays.asList("C"));      // Remove matching elements
        set.retainAll(Arrays.asList("A"));      // Keep only matching elements

        System.out.println(set.contains("A"));  // Check if element exists
        System.out.println(set.containsAll(Arrays.asList("A"))); // Check all exist
        System.out.println(set.size());          // Size of set
        System.out.println(set.isEmpty());       // Check if empty

        Object[] arr = set.toArray();            // Convert to Object array
        String[] strArr = set.toArray(new String[0]); // Convert to typed array

        Iterator<String> it = set.iterator();    // Use iterator
        while (it.hasNext()) {
            System.out.println(it.next());       // Print each element
        }

        set.clear();                             // Clear the set
    }
}