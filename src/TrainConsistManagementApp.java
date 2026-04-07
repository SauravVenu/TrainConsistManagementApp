import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("--- UC17: Optimized Built-in Sorting ---\n");
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Original: " + Arrays.toString(bogieTypes));

        Arrays.sort(bogieTypes);

        System.out.println("Alphabetical Order: " + Arrays.toString(bogieTypes));
    }
}
