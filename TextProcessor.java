import java.util.Scanner;

class TextProcessor {
    char text[]; 
    int length; 

    
    TextProcessor() {
        length = 100; 
        text = new char[length];
    }
    TextProcessor(int size) {
        this.length = size;
        text = new char[length];
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a mixed text string:");
        String str = scan.nextLine();

        // Store in character array
        length = str.length();
        text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = str.charAt(i);
        }
    }

    // Method to process the text
    void processText() {
        int digitCount = 0; 
        for (int i = 0; i < length; i++) {
            if (Character.isDigit(text[i])) {
                digitCount++;
            }
        }

        char reversedDigits[] = new char[digitCount]; 
        int index = 0;

        // Store digits in reverse order
        for (int i = length - 1; i >= 0; i--) {
            if (Character.isDigit(text[i])) {
                reversedDigits[index] = text[i];
                index++;
            }
        }

        index = 0; 
        
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(text[i])) {
                text[i] = Character.toLowerCase(text[i]);
            } 
            else if (Character.isLowerCase(text[i])) {
                text[i] = Character.toUpperCase(text[i]);
            } 
            else if (Character.isDigit(text[i])) {
                text[i] = reversedDigits[index]; 
                index++;
                if (text[i] == '0') {
                    text[i] = 'O';               
		 }
            } 
            else {
                text[i] = '*';             }
        }
    }
    void display() {
        System.out.print("Processed text: ");
        for (int i = 0; i < length; i++) {
            System.out.print(text[i]);
        }
        System.out.println();
    }

   
    public static void main(String args[]) {
        TextProcessor obj = new TextProcessor();
        obj.input(); 
        obj.processText(); 
        obj.display(); 
    }
}
