import java.util.Arrays;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC10 - Count Total Seats ");
        System.out.println("========================================\n");

        // List representing seat capacities of various bogies
        List<Integer> capacities = Arrays.asList(72, 54, 24, 72, 64);

        // Use reduce to calculate the sum of all capacities
        int totalSeats = capacities.stream()
                .reduce(0, (sum, cap) -> sum + cap);

        System.out.println("Individual Bogie Capacities: " + capacities);
        System.out.println("Total Seating Capacity of the Train: " + totalSeats);

        System.out.println("\nUC10 total capacity calculation completed...");
    }
}
