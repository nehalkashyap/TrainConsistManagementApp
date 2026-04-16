import java.util.*;

public class UseCase20TrainConsistMgmt {

    // Search method with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // 🔴 Fail-Fast Check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available. Cannot perform search.");
        }

        // Linear Search (can also use Binary Search if sorted)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Empty Array (should throw exception)
        try {
            String[] empty = {};
            System.out.println("Search BG101: " + searchBogie(empty, "BG101"));
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Test Case 2: Data Exists
        String[] bogies = {"BG101","BG205","BG309"};

        System.out.println("Search BG205: " + searchBogie(bogies, "BG205")); // true
        System.out.println("Search BG999: " + searchBogie(bogies, "BG999")); // false

        // Test Case 3: Single Element
        String[] single = {"BG101"};
        System.out.println("Single Element Search: " + searchBogie(single, "BG101"));

        System.out.println("Program continues safely...");
    }
}
