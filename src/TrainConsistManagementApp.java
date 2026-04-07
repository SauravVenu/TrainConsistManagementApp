import java.util.Set;
import java.util.LinkedHashSet;

/**
 * UC5: Preserve Insertion Order of Bogies
 * This implementation uses LinkedHashSet to track the sequence
 * in which bogies were attached to the train. [cite: 2]
 */
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order ");
        System.out.println("========================================\n");

        // LinkedHashSet maintains the order of insertion
        Set<String> bogies = new LinkedHashSet<>();

        // Adding IDs in a specific sequence [cite: 2]
        bogies.add("BG101"); // First attached
        bogies.add("BG104");
        bogies.add("BG102");
        bogies.add("BG103"); // Last attached

        System.out.println("Bogie IDs in Insertion Order:");
        System.out.println(bogies);

        System.out.println("\nNote: LinkedHashSet preserves the sequence of addition.");
        System.out.println("UC5 sequence validation completed...");
    }
}