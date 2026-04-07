import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("--- UC16: Bubble Sort (Manual Sorting) ---\n");
        int[] capacities = {72, 56, 24, 70, 60};
        int n = capacities.length;

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap elements
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting:  " + Arrays.toString(capacities));
    }
}
