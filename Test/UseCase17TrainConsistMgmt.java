import java.util.*;

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        // Test Case 1: Basic Unsorted Array
        String[] bogies1 = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};
        System.out.println("Original: " + Arrays.toString(bogies1));

        Arrays.sort(bogies1);
        System.out.println("Sorted: " + Arrays.toString(bogies1));

        // Test Case 2: Unsorted Input
        String[] bogies2 = {"Luxury", "General", "Sleeper", "AC Chair"};
        Arrays.sort(bogies2);
        System.out.println("Unsorted Input Sorted: " + Arrays.toString(bogies2));

        // Test Case 3: Already Sorted
        String[] bogies3 = {"AC Chair", "First Class", "General"};
        Arrays.sort(bogies3);
        System.out.println("Already Sorted: " + Arrays.toString(bogies3));

        // Test Case 4: Duplicate Names
        String[] bogies4 = {"Sleeper", "AC Chair", "Sleeper", "General"};
        Arrays.sort(bogies4);
        System.out.println("With Duplicates: " + Arrays.toString(bogies4));

        // Test Case 5: Single Element
        String[] bogies5 = {"Sleeper"};
        Arrays.sort(bogies5);
        System.out.println("Single Element: " + Arrays.toString(bogies5));

        System.out.println("Program continues...");
    }
}