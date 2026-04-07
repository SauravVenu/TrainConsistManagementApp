import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Map Bogie to Capacity
 * This implementation uses HashMap to store Bogie ID as a Key
 * and its Capacity as a Value.
 */
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("========================================\n");

        // HashMap stores Key-Value pairs
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Mapping Bogie IDs to their respective capacities
        bogieCapacity.put("BG101", 72); // Sleeper Class
        bogieCapacity.put("BG102", 54); // AC Chair Car
        bogieCapacity.put("BG103", 24); // First Class
        bogieCapacity.put("BG104", 72);

        System.out.println("Bogie ID -> Seating Capacity:");
        // Iterating through the map to display data
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        System.out.println("\nNote: HashMap allows quick lookup of capacity using the Bogie ID.");
        System.out.println("UC6 mapping validation completed...");
    }
}