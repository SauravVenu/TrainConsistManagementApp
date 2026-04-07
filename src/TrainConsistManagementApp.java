import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("--- UC13: Performance Comparison ---\n");

        List<Integer> capacities = new ArrayList<>();
        for (int i = 0; i < 100000; i++) capacities.add((int) (Math.random() * 100));

        // 1. Loop Performance
        long startLoop = System.nanoTime();
        List<Integer> filteredLoop = new ArrayList<>();
        for (int c : capacities) {
            if (c > 60) filteredLoop.add(c);
        }
        long endLoop = System.nanoTime();

        // 2. Stream Performance
        long startStream = System.nanoTime();
        long count = capacities.stream().filter(c -> c > 60).count();
        long endStream = System.nanoTime();

        System.out.println("Loop Time: " + (endLoop - startLoop) + " ns");
        System.out.println("Stream Time: " + (endStream - startStream) + " ns");

        System.out.println("\nUC13 benchmarking completed...");
    }
}