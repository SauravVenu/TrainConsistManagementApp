import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie class (reused from UC7/UC8)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + " seats)";
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 50));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("Sleeper", 72)); // duplicate type
        passengerBogies.add(new Bogie("Executive", 80));

        // Display original list
        System.out.println("\nOriginal Passenger Bogies:");
        System.out.println(passengerBogies);

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = passengerBogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped bogies
        System.out.println("\nGrouped Passenger Bogies by Type:");
        groupedBogies.forEach((type, bogies) -> {
            System.out.println(type + " -> " + bogies);
        });

        // Verify original list remains unchanged
        System.out.println("\nOriginal list after grouping (unchanged):");
        System.out.println(passengerBogies);
    }
}gi