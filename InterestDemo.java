import java.io.*;
import java.util.Scanner;
abstract class Interest
{
	abstract double calcInterest();
}
class SimpleInterest extends Interest
{
	private int p;
	private int r;
	private int t;
	SimpleInterest(int p, int r,int t)
	{
		this.p = p;
		this.r = r;
		this.t = t;
	}
	double calcInterest()
	{
		return (p * r * t)/100.0f;
	}
}
class CompoundInterest extends Interest
{
	private int p;
	private int r;
	private int t;
	CompoundInterest(int p, int r,int t)
	{
		this.p = p;
		this.r = r;
		this.t = t;
	}
	double calcInterest()
	{
		return p*(Math.pow((1 + r/100.00),t));
	}
}
public class  InterestDemo

{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle: ");
		int p = scan.nextInt();
		System.out.println("Enter the Rate ");
		int r = scan.nextInt();
		System.out.println("Enter the Time ");
		int t = scan.nextInt();
		while(true)
		{
			System.out.println("___________________________");
			System.out.println("What you want to calculate: ");
			System.out.println("1.Simple Interest \n2.Compound Interest \n3.Exit");
			int ch = scan.nextInt();
			switch(ch)
			{
				case 1: SimpleInterest s = new SimpleInterest(p,r,t);
					double i1 = s.calcInterest();
					System.out.println("Interest is : "+i1);
					break;
				case 2: CompoundInterest c = new CompoundInterest(p,r,t);
					double i2 = c.calcInterest();
					System.out.println("Interest is : "+i2);
					break;
				case 3: System.exit(0);
			}
		}
	}


}
