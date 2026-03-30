import java.util.HashSet;
import java.util.Set;

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   UC3 - Track Unique Bogie IDs ");
        System.out.println("======================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // --- ADD IDs (including duplicates) ---
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored automatically)
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Display final set
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);

        System.out.println("\nTotal Unique Bogies: " + bogies.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}