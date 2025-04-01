import java.util.Scanner;
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}


class Triangle {
    double side1, side2, side3;


    public Triangle(double s1, double s2, double s3) throws IllegalTriangleException {
        if (s1 + s2 <= s3 || s1 + s3 <= s2 || s2 + s3 <= s1) {
            throw new IllegalTriangleException("Invalid triangle: The sum of any two sides must be greater than the third.");
        }
        
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }


    public void showTriangle() {
        System.out.println("Triangle sides: " + side1 + ", " + side2 + ", " + side3);
    }
}

public class TriangleTest {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        try {
	    double s1 = scan.nextInt();
	    double s2 = scan.nextInt();
	    double s3 = scan.nextInt();


	
            Triangle t1 = new Triangle(s1, s2, s3); // Valid triangle
            t1.showTriangle();
            
                   } 
        catch (IllegalTriangleException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
