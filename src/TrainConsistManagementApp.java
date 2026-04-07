class CargoSafetyException extends Exception {
    public CargoSafetyException(String message) { super(message); }
}

public class TrainConsistManagementApp {
    public static void assignCargo(String type, String cargo) throws CargoSafetyException {
        if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
            throw new CargoSafetyException("Safety Violation: Petroleum cannot be carried in Rectangular bogies!");
        }
        System.out.println("Cargo '" + cargo + "' successfully assigned to " + type + " bogie.");
    }

    public static void main(String[] args) {
        System.out.println("--- UC15: Safe Cargo Assignment ---\n");
        String[][] tasks = {{"Cylindrical", "Petroleum"}, {"Rectangular", "Petroleum"}};

        for (String[] task : tasks) {
            try {
                assignCargo(task[0], task[1]);
            } catch (CargoSafetyException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Validation check completed for: " + task[0]);
            }
            System.out.println();
        }
    }
}