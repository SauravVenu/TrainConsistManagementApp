import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String id;
    int capacity;

    Bogie(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return id + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("========================================\n");

        List<Bogie> train = new ArrayList<>();
        train.add(new Bogie("BG101", 72));
        train.add(new Bogie("BG102", 24));
        train.add(new Bogie("BG103", 54));

        // Sort using Comparator (ascending order of capacity)
        train.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Bogies Sorted by Capacity:");
        train.forEach(System.out::println);

        System.out.println("\nUC7 sorting validation completed...");
    }
}