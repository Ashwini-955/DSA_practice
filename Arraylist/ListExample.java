import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");                          // Add element at end
        list.add("B");
        list.add(1, "C");                        // Add element at index

        List<String> list2 = Arrays.asList("X", "Y");
        list.addAll(list2);                      // Add all elements from another collection
        list.addAll(2, Arrays.asList("P", "Q")); // Add all at specific index

        System.out.println(list.get(2));         // Get element by index
        list.set(0, "Z");                        // Replace element at index

        list.remove(1);                          // Remove element by index
        list.remove("X");                        // Remove element by value

        list.removeAll(Arrays.asList("Y", "Q")); // Remove all matching elements
        list.retainAll(Arrays.asList("Z", "P")); // Keep only matching elements

        System.out.println(list.indexOf("P"));   // First index of element
        System.out.println(list.lastIndexOf("P")); // Last index of element

        List<String> sub = list.subList(0, 1);    // Get sublist
        System.out.println(sub);

        System.out.println(list.contains("P"));   // Check if element exists
        System.out.println(list.containsAll(Arrays.asList("P", "Z"))); // Check all

        System.out.println(list.size());         // Get size
        System.out.println(list.isEmpty());      // Check if list is empty

        Object[] arr = list.toArray();           // Convert to Object array
        String[] strArr = list.toArray(new String[0]); // Convert to String array

        Iterator<String> it = list.iterator();   // Iterator for traversal
        while (it.hasNext()) {
            System.out.println(it.next());       // Print each element
        }

        list.clear();                            // Clear the list
    }
}