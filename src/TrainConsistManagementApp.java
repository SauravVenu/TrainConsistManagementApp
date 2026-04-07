import java.util.Set;
import java.util.TreeSet;

/**
 * UC4: Maintain Ordered Bogie IDs
 * This implementation uses TreeSet to ensure bogie IDs are stored
 * and displayed in sorted order. [cite: 4]
 */
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("========================================\n");

        // TreeSet automatically sorts elements in natural ascending order
        Set<String> bogies = new TreeSet<>();

        // Adding IDs in random order [cite: 4]
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG103");
        bogies.add("BG102");

        // Displaying the set [cite: 4]
        System.out.println("Bogie IDs in Sorted Order:");
        System.out.println(bogies);

        System.out.println("\nNote: TreeSet maintains elements in ascending order.");
        System.out.println("UC4 ordered validation completed...");
    }
}
