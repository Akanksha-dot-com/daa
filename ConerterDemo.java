import java.util.Scanner;
class Convert {
    Integer num;
    public Convert(Integer num)
    {
	this.num = num;
    }
    void printIntTwice() {
        int value = num.intValue();
        System.out.println(value + " " + value);
    }


    void printDoubleFourTimes() {
        double value = num.doubleValue();
        System.out.println(value + " " + value + " " + value + " " + value);
    }
}

public class ConerterDemo {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
        Integer num = scan.nextInt();  
        Convert obj = new Convert(num);  
       
        System.out.print("Integer value printed twice: ");
        obj.printIntTwice();

        System.out.print("Double value printed four times: ");
        obj.printDoubleFourTimes();
    }
}
