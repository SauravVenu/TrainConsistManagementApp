import java.util.ArrayList;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase1TrainConsistMgmnt
 * =========================================================
 * * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 * * At this stage, the application:
 * - Creates an empty train consist
 * - Uses a dynamic List to store bogies
 * - Displays initial bogie count
 * - Prints the current state of the train
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Display welcome banner [cite: 12, 33]
        System.out.println("=============================================");
        System.out.println(" === Train Consist Management App === ");
        System.out.println("=============================================\n");

        // Create a dynamic list to store train bogies [cite: 12, 25, 34]
        // We use the List interface for abstraction and ArrayList for dynamic sizing [cite: 26, 27]
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information [cite: 12, 18]
        System.out.println("Train initialized successfully...");

        // Display the initial bogie count using the size() method [cite: 35]
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Print the current state of the train (empty list) [cite: 11, 41]
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}