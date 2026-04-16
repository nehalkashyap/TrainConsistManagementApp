import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;   // Passenger / Goods
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class UC13_PerformanceTest {
    public static void main(String[] args) {

        // Step 1: Create collection of bogies
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            if (i % 2 == 0)
                bogies.add(new Bogie("Passenger", 100));
            else
                bogies.add(new Bogie("Goods", 200));
        }

        // -------------------------------
        // 🔹 Loop-Based Filtering
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> passengerList1 = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getType().equals("Passenger")) {
                passengerList1.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // 🔹 Stream-Based Filtering
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> passengerList2 = bogies.stream()
                .filter(b -> b.getType().equals("Passenger"))
                .collect(Collectors.toList());

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // Output Results
        // -------------------------------
        System.out.println("Loop Filtering Time (ns): " + loopTime);
        System.out.println("Stream Filtering Time (ns): " + streamTime);

        // Optional: verify both results
        System.out.println("Loop Count: " + passengerList1.size());
        System.out.println("Stream Count: " + passengerList2.size());
    }
}