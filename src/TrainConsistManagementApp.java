public class TrainConsistManagementApp {
    public static int binarySearch(String[] arr, String key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = key.compareTo(arr[mid]);

            if (res == 0) return mid;
            if (res > 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("--- UC19: Binary Search (O(log n)) ---\n");
        // Pre-sorted array is a requirement
        String[] sortedBogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String target = "BG412";

        int result = binarySearch(sortedBogies, target);
        System.out.println("Bogie " + target + (result != -1 ? " found at index " + result : " not found."));
    }
}
