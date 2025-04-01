import java.util.Scanner;
class Sum
{
	int num;
	void allSum()
	{
		int even=0,odd=0,evenPos=0,oddPos=0;
		int c=0,d=0;
		while( num != 0)
		{
			c++;
			d = num % 10;
			if(d % 2 == 0)
			{
				even += d;
			}
			else
			{
				odd += d;
			}
			if(c % 2 == 0)
			{
				evenPos += d;
			}
			else
			{
				oddPos += d;
			}
			num = num / 10;
		}
			System.out.println("Sum of even digits: " +even);
			System.out.println("Sum of odd digits: " +odd);
			System.out.println("Sum of even position digit: " +evenPos);
			System.out.println("Sum of odd position digit: " +oddPos);
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Sum s1 = new Sum();
		System.out.println("Enter the number: ");
		s1.num = scan.nextInt();
		s1.allSum();
	}
}