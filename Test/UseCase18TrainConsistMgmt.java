import java.util.*;

public class UseCase18TrainConsistMgmt {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            // Compare using equals()
            if (bogieIds[i].equals(key)) {
                return true;   // Match found → stop early
            }
        }

        return false; // Not found after full traversal
    }

    public static void main(String[] args) {

        // Test Case 1: Basic Search
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey1 = "BG309";
        boolean result1 = linearSearch(bogies, searchKey1);
        System.out.println("Search " + searchKey1 + ": " + result1);

        // Test Case 2: Not Found
        String searchKey2 = "BG999";
        boolean result2 = linearSearch(bogies, searchKey2);
        System.out.println("Search " + searchKey2 + ": " + result2);

        // Test Case 3: First Element Match
        String searchKey3 = "BG101";
        System.out.println("Search " + searchKey3 + ": " + linearSearch(bogies, searchKey3));

        // Test Case 4: Last Element Match
        String searchKey4 = "BG550";
        System.out.println("Search " + searchKey4 + ": " + linearSearch(bogies, searchKey4));

        // Test Case 5: Single Element
        String[] single = {"BG101"};
        System.out.println("Search BG101 in single array: " + linearSearch(single, "BG101"));

        System.out.println("Program continues...");
    }
}