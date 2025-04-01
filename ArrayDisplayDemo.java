import java.util.Random;
import java.util.Scanner;
import java.io.IOException;  // Import IOException

class ArrayDisplay {
    int[] numbers;

    // Constructor to initialize and populate the array
    ArrayDisplay() {
        numbers = new int[20];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); // Generate random numbers (0-99)
        }
    }

    // Method to show element at a given index
    public void showElement(int index) throws IOException {
        if (index < 0 || index >= 20) {  // Fix index bounds
            throw new IOException("Index Out of Bounds");
        } else {
            System.out.println("The element at index " + index + " is: " + numbers[index]);
        }
    }

    // Method to add element at a given index
    public void addElement(int ind, int val) throws IOException {
        if (ind < 0 || ind >= 20) {  // Fix index bounds
            throw new IOException("Index Out of Bounds");
        } else {
            numbers[ind] = val;
            System.out.println("Value " + val + " inserted at index " + ind);
        }
    }
}

public class ArrayDisplayDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDisplay obj = new ArrayDisplay();

        // Display the initial array
        System.out.println("Generated Array:");
        for (int i = 0; i < 20; i++) {
            System.out.print(obj.numbers[i] + " ");
        }
        System.out.println("\n");

        try {
            // Ask user for index and value to insert
            System.out.print("Enter the index where you want to insert an element (0-19): ");
            int ind = scan.nextInt();
            System.out.print("Enter the number you want to insert: ");
            int val = scan.nextInt();

            obj.addElement(ind, val);  // Insert the value
            obj.showElement(ind);  // Show the inserted value
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scan.close(); // Close the scanner
        }
    }
}
