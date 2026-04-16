import java.util.*;

public class UseCase19TrainConsistMgmt {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = bogieIds[mid].compareTo(key);

            if (compare == 0) {
                return true; // Found
            }
            else if (compare < 0) {
                low = mid + 1; // Search right half
            }
            else {
                high = mid - 1; // Search left half
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        // Test Case 1: Sorted Input
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String key1 = "BG309";
        System.out.println("Search " + key1 + ": " + binarySearch(bogies, key1));

        // Test Case 2: Not Found
        String key2 = "BG999";
        System.out.println("Search " + key2 + ": " + binarySearch(bogies, key2));

        // Test Case 3: First Element
        System.out.println("Search BG101: " + binarySearch(bogies, "BG101"));

        // Test Case 4: Last Element
        System.out.println("Search BG550: " + binarySearch(bogies, "BG550"));

        // Test Case 5: Single Element
        String[] single = {"BG101"};
        System.out.println("Single Element Search: " + binarySearch(single, "BG101"));

        // Test Case 6: Empty Array
        String[] empty = {};
        System.out.println("Empty Array Search: " + binarySearch(empty, "BG101"));

        // Test Case 7: Unsorted Input (handled)
        String[] unsorted = {"BG309","BG101","BG550","BG205","BG412"};
        Arrays.sort(unsorted); // sort before binary search
        System.out.println("Unsorted handled (BG205): " + binarySearch(unsorted, "BG205"));

        System.out.println("Program continues...");
    }
}
