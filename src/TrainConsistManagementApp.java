public class TrainConsistManagementApp {
    public static boolean linearSearch(String[] arr, String key) {
        for (String id : arr) {
            if (id.equals(key)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- UC18: Linear Search (O(n)) ---\n");
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String target = "BG309";

        boolean found = linearSearch(bogies, target);
        System.out.println("Searching for " + target + "... Found: " + found);
    }
}