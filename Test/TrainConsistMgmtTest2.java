import java.util.*;
import java.util.stream.*;

class TrainConsistMgmt {
    String name;
    int capacity;

    TrainConsistMgmt(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class TrainConsistMgmt {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC10 - Total Seat Count using reduce()");
        System.out.println("========================================\n");

        // Create list of bogies
        List<TrainConsistMgmt> bogies = new ArrayList<>();

        bogies.add(new TrainConsistMgmt("Sleeper", 72));
        bogies.add(new TrainConsistMgmt("AC Chair", 56));
        bogies.add(new TrainConsistMgmt("First Class", 24));
        bogies.add(new TrainConsistMgmt("Sleeper", 70));
        bogies.add(new TrainConsistMgmt("AC Chair", 60));

        // Display all bogies
        System.out.println("All Bogies:");
        for (TrainConsistMgmt b : bogies) {
            System.out.println(b.name + " -> Capacity: " + b.capacity);
        }

        // --- REDUCE OPERATION ---
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)     // Extract capacity
                .reduce(0, (a, b) -> a + b);  // Sum all values

        // Display result
        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}