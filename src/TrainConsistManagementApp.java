import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistManagementApp {

    // Bogie class
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

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 50));
        passengerBogies.add(new Bogie("First Class", 24));

        // Display unsorted bogies
        System.out.println("\nPassenger Bogies (Unsorted):");
        System.out.println(passengerBogies);

        // Sort bogies by capacity (ascending)
        passengerBogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\nPassenger Bogies (Sorted by Capacity):");
        System.out.println(passengerBogies);
    }
}