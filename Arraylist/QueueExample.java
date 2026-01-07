import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("A");                         // Add element (throws exception if fails)
        queue.offer("B");                       // Add element (returns false if fails)

        System.out.println(queue.element());     // Get head (throws exception if empty)
        System.out.println(queue.peek());        // Get head (returns null if empty)

        System.out.println(queue.poll());        // Remove and return head
        System.out.println(queue.remove());      // Remove and return head (exception if empty)

        queue.add("X");
        queue.add("Y");

        System.out.println(queue.contains("X")); // Check if element exists
        System.out.println(queue.size());        // Size of queue
        System.out.println(queue.isEmpty());     // Check if queue is empty

        Iterator<String> it = queue.iterator();  // Use iterator to print
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Object[] arr = queue.toArray();          // Convert to array

        queue.clear();                           // Clear the queue
    }
}