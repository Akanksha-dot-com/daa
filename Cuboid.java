import java.util.Scanner;

public class Cuboid extends Rectangle {
    private float h, wt;


    public Cuboid() {
        h = 1.0f;
        wt = 1.0f;
    }

    
    Cuboid(float l, float b, float h, float wt) {
        super(l, b);
        this.h = h;
        this.wt = wt;
    }


    void inputc() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        setl(scan.nextFloat());
        System.out.print("Enter width: ");
        setw(scan.nextFloat());
        System.out.print("Enter height: ");
        this.h = scan.nextFloat();
        System.out.print("Enter weight: ");
        this.wt = scan.nextFloat();
    }

  
    void surfaceArea() {
        float area = 2 * (getl() * getw() + getl() * h + getw() * h);
        System.out.println("Surface area of cuboid is: " + area);
    }


    void volume() {
        float vol = getl() * getw() * h;
        System.out.println("Volume of cuboid is: " + vol);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        
        Cuboid cb = new Cuboid();
        cb.surfaceArea();
        cb.volume();

        
        System.out.println("ENTER LENGTH, WIDTH, HEIGHT, AND WEIGHT: ");
        float c1 = scan.nextFloat();
        float c2 = scan.nextFloat();
        float c3 = scan.nextFloat();
        float c4 = scan.nextFloat();

        Cuboid c = new Cuboid(c1, c2, c3, c4);
        c.surfaceArea();
        c.volume();

       
    }
}
