// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    private int capacity;
    private String type;

    // Constructor with validation
    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Invalid capacity! Must be greater than 0.");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie Type: " + type + ", Capacity: " + capacity);
    }
}

// Main Class (Use Case 14)
public class UseCase14TrainConsistMgmt {
    public static void main(String[] args) {

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC", 0);
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}