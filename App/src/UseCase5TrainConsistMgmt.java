import java.util.LinkedHashSet;

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC5 - Preserve Insertion Order (LinkedHashSet) ");
        System.out.println("======================================\n");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper"); // duplicate (ignored)

        // Display final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");
        System.out.println(train);

        System.out.println("\nTotal Unique Bogies: " + train.size());

        System.out.println("\nUC5 operations completed successfully...");
    }
}