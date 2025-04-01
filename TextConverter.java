import java.util.Scanner;

class TextConverter {
    char text[]; 
    int length; 
    TextConverter() {
        length = 100; 
        text = new char[length];
    }
    TextConverter(int size) {
        this.length = size;
        text = new char[length];
    }
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an uppercase string:");
        String str = scan.nextLine();
        length = str.length(); 
        text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = str.charAt(i);
        }
    }
    void convertToLowercase() {
        for (int i = 0; i < length; i++) {
            text[i] = Character.toLowerCase(text[i]);
        }
    }
    void display() {
        System.out.print("Converted lowercase string: ");
        for (int i = 0; i < length; i++) {
            System.out.print(text[i]);
        }
        System.out.println();
    }
    public static void main(String args[]) {
        TextConverter obj = new TextConverter(); 
        obj.input(); 
        obj.convertToLowercase(); 
        obj.display(); 
    }
}
