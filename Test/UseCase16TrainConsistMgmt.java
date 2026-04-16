public class UseCase16TrainConsistMgmt {

    // Bubble Sort Method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop (passes)
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop (compare adjacent elements)
            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) break;
        }
    }

    // Method to display array
    public static void display(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1: Basic Unsorted Array
        int[] capacities1 = {72, 56, 24, 70, 60};
        System.out.print("Original: ");
        display(capacities1);

        bubbleSort(capacities1);

        System.out.print("Sorted: ");
        display(capacities1);

        // Test Case 2: Already Sorted
        int[] capacities2 = {24, 56, 60, 70, 72};
        bubbleSort(capacities2);
        System.out.print("Already Sorted: ");
        display(capacities2);

        // Test Case 3: Duplicates
        int[] capacities3 = {72, 56, 56, 24};
        bubbleSort(capacities3);
        System.out.print("With Duplicates: ");
        display(capacities3);

        // Test Case 4: Single Element
        int[] capacities4 = {50};
        bubbleSort(capacities4);
        System.out.print("Single Element: ");
        display(capacities4);

        // Test Case 5: All Equal
        int[] capacities5 = {40, 40, 40};
        bubbleSort(capacities5);
        System.out.print("All Equal: ");
        display(capacities5);

        System.out.println("Program continues...");
    }
}