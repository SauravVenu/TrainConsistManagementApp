import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    // Bogie class (reused from UC7–UC9)
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
        passengerBogies.add(new Bogie("Executive", 80));

        // Display original list
        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);

        // Calculate total seating capacity using map + reduce
        int totalSeats = passengerBogies.stream()
                .map(b -> b.capacity)           // Extract capacities
                .reduce(0, Integer::sum);       // Sum capacities

        // Display total seating capacity
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats + " seats");

        // Verify original list remains unchanged
        System.out.println("\nOriginal list after aggregation (unchanged):");
        System.out.println(passengerBogies);
    }
}