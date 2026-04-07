public class TrainConsistManagementApp {
    public static boolean safeSearch(String[] bogies, String key) {
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("Search Failed: No bogies present in the train consist!");
        }
        for (String b : bogies) {
            if (b.equals(key)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- UC20: Fail-Fast Search Validation ---\n");
        String[] emptyTrain = {};

        try {
            System.out.println("Searching empty train...");
            safeSearch(emptyTrain, "BG101");
        } catch (IllegalStateException e) {
            System.err.println("Caught Expected Exception: " + e.getMessage());
        }

        System.out.println("\nUC20 search validation completed.");
    }
}