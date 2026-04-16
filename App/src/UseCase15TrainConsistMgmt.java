// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    private String shape;   // Rectangular / Cylindrical
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargoType) {
        try {
            // Validate unsafe condition
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe! Petroleum cannot be stored in Rectangular bogie.");
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned: " + cargo + " to " + shape + " bogie");

        } catch (CargoSafetyException e) {
            // Handle exception
            System.out.println("Error: " + e.getMessage());

        } finally {
            // Always executes
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }
}

// Main Class (Use Case 15)
public class UseCase14TrainConsistMgmt {
    public static void main(String[] args) {

        // Safe case
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        g1.assignCargo("Petroleum");

        // Unsafe case
        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g2.assignCargo("Petroleum");

        // Another safe case
        GoodsBogie g3 = new GoodsBogie("Rectangular");
        g3.assignCargo("Coal");

        System.out.println("Program continues safely...");
    }
}