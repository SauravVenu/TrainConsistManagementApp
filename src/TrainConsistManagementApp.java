import java.util.Arrays;
import java.util.List;

class GoodsBogie {
    String type; // "Cylindrical" or "Box"
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" UC12 - Safety Compliance Check ");
        System.out.println("========================================\n");

        List<GoodsBogie> train = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal"),
                new GoodsBogie("Cylindrical", "Petroleum")
        );

        // Safety Rule: If type is Cylindrical, cargo MUST be Petroleum
        boolean isSafe = train.stream().allMatch(b ->
                !(b.type.equals("Cylindrical")) || b.cargo.equals("Petroleum")
        );

        System.out.println("Is the train formation safe? " + (isSafe ? "YES" : "NO"));

        System.out.println("\nUC12 safety validation completed...");
    }
}