import java.util.*;
import java.util.stream.Collectors;

class TrainConsistMgmt {
    String name;
    int capacity;

    public TrainConsistMgmt(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        System.out.println("=======================================");
        System.out.println(" UC9 - Group Bogies by Type ");
        System.out.println("=======================================\n");

        // Create list of bogies
        List<TrainConsistMgmt> bogies = new ArrayList<>();

        bogies.add(new TrainConsistMgmt("Sleeper", 72));
        bogies.add(new TrainConsistMgmt("AC Chair", 56));
        bogies.add(new TrainConsistMgmt("First Class", 24));
        bogies.add(new TrainConsistMgmt("Sleeper", 70));
        bogies.add(new TrainConsistMgmt("AC Chair", 60));

        // Display input bogies
        System.out.println("All Bogies:");
        for (TrainConsistMgmt b : bogies) {
            System.out.println(b);
        }

        // ---- GROUP USING COLLECTORS.GROUPINGBY ----
        Map<String, List<TrainConsistMgmt>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped structure
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<TrainConsistMgmt>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());

            for (TrainConsistMgmt b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
    }
}