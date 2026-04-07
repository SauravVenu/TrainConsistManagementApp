// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero for " + type);
        }
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("--- UC14: Custom Exception Handling ---\n");

        try {
            System.out.println("Attempting to create valid bogie...");
            new PassengerBogie("Sleeper", 72);
            System.out.println("Success!");

            System.out.println("\nAttempting to create invalid bogie...");
            new PassengerBogie("AC Chair", -10); // This will trigger the exception

        } catch (InvalidCapacityException e) {
            System.err.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling validation completed...");
    }
}