import java.util.regex.Pattern;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("========================================\n");

        // Regex Patterns
        // TRN- followed by exactly 4 digits
        String trainIdPattern = "^TRN-\\d{4}$";
        // 3 Uppercase letters, hyphen, 2 Uppercase letters
        String cargoCodePattern = "^[A-Z]{3}-[A-Z]{2}$";

        String testTrainId = "TRN-1234";
        String testCargoCode = "PET-AB";

        boolean isTrainIdValid = Pattern.matches(trainIdPattern, testTrainId);
        boolean isCargoValid = Pattern.matches(cargoCodePattern, testCargoCode);

        System.out.println("Train ID [" + testTrainId + "] Valid: " + isTrainIdValid);
        System.out.println("Cargo Code [" + testCargoCode + "] Valid: " + isCargoValid);

        // Negative Test
        System.out.println("Train ID [TRAIN12] Valid: " + Pattern.matches(trainIdPattern, "TRAIN12"));

        System.out.println("\nUC11 regex validation completed...");
    }
}