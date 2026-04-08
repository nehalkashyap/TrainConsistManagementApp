import java.util.*;
import java.util.stream.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("==============================================");

        // Create list of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 30));
        bogies.add(new Bogie("General", 90));
        bogies.add(new Bogie("Executive Chair", 60));

        // Business Rule: Filter bogies with capacity >= 60
        int minCapacity = 60;

        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity >= minCapacity)
                .collect(Collectors.toList());

        // Display filtered bogies
        System.out.println("\nPassenger Bogies with capacity >= " + minCapacity + ":\n");

        filteredBogies.forEach(System.out::println);
    }
}