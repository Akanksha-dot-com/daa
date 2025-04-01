import java.util.Scanner;

public class StringConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        System.out.println("\nConversions:");
        for (char ch : input.toCharArray()) {
            int ascii = (int) ch;  

            // Convert to different bases
            String binary = Integer.toBinaryString(ascii);
            String octal = Integer.toOctalString(ascii);
            String hex = Integer.toHexString(ascii);

            
            System.out.println("'" + ch + "' -> Binary: " + binary + ", Octal: " + octal + ", Hexadecimal: " + hex);
        }

       
    }
}
