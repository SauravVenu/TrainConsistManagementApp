import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies ");
        System.out.println("========================================\n");

        List<String> allBogies = Arrays.asList("Passenger_S1", "Goods_G1", "Passenger_A1", "Goods_G2");

        // Use Streams to filter IDs starting with "Passenger"
        List<String> passengerBogies = allBogies.stream()
                .filter(b -> b.startsWith("Passenger"))
                .collect(Collectors.toList());

        System.out.println("Filtered Passenger Bogies:");
        passengerBogies.forEach(System.out::println);

        System.out.println("\nUC8 stream filtering completed...");
    }
}