import java.util.Scanner;

public class Rectangle {
    private float l;
    private float w;

    // Default constructor
    public Rectangle() {
        l = 1.0f;
        w = 1.0f;
    }

    // Parameterized constructor
    public Rectangle(float l, float w) {
        setl(l);  // Using setter for validation
        setw(w);  // Using setter for validation
    }

    // Getter for length
    public float getl() {
        return l;
    }

    // Getter for width
    public float getw() {
        return w;
    }

    // Setter for length
    public void setl(float l) { 
        if (l >= 0.0f && l <= 20.0f)
            this.l = l;
        else
            System.out.println("❌ Length must be in the range of 0.0 to 20.0");
    }

    // Setter for width
    public void setw(float w) { 
        if (w >= 0.0f && w <= 20.0f)
            this.w = w;
        else
            System.out.println("❌ Width must be in the range of 0.0 to 20.0");
    }

    // Method to calculate area
    float area() {
        return l * w;
    }

    // Method to calculate perimeter
    float perimeter() {
        return 2 * (l + w);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        // Creating a rectangle with default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("📏 Default Rectangle:");
        System.out.println("Length: " + r1.getl());
        System.out.println("Width: " + r1.getw());
        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());

        // Taking user input for a new rectangle
        System.out.print("\n🔢 Enter new length: ");
        float length = scan.nextFloat();
        System.out.print("🔢 Enter new width: ");
        float width = scan.nextFloat();

        // Creating a rectangle using parameterized constructor
        Rectangle r2 = new Rectangle(length, width);

        // Displaying updated rectangle details
        System.out.println("\n🆕 Updated Rectangle:");
        System.out.println("Length: " + r2.getl());
        System.out.println("Width: " + r2.getw());
        System.out.println("Area: " + r2.area());
        System.out.println("Perimeter: " + r2.perimeter());

        scan.close();
    }
}
