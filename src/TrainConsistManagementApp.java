import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("========================================\n");

        List<String> bogies = Arrays.asList("Passenger_S1", "Goods_G1", "Passenger_A1", "Goods_G2", "Passenger_B1");

        // Grouping logic based on the prefix of the string
        Map<String, List<String>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.split("_")[0]));

        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " Bogies: " + list);
        });

        System.out.println("\nUC9 grouping validation completed...");
    }
}
