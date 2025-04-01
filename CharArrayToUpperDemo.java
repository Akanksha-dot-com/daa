import java.util.Scanner;

class CharArrayToUpper {
    private char[] arr;

    // Constructor to initialize the char array
    public CharArrayToUpper(int size) {
        arr = new char[size];
    }

    // Method to take character input from the user
    void input(Scanner scan) {
        System.out.println("Enter " + arr.length + " characters one by one:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next().charAt(0); // Read a single character from input
        }
    }

    // Method to display the character array
    void display() {
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println(); // New line for better formatting
    }

    // Method to convert characters to uppercase
    void convert() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(arr[i]);
        }
    }
}

// Driver class
public class CharArrayToUpperDemo {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // Declare Scanner in main
        CharArrayToUpper obj = new CharArrayToUpper(5);
        
        obj.input(scan);  // Take user input
        System.out.println("Original characters:");
        obj.display(); // Display original characters
        
        obj.convert(); // Convert to uppercase
        System.out.println("Uppercase characters:");
        obj.display(); // Display converted characters
        
        scan.close(); // Now it's safe to close Scanner
    }
}

