import java.util.Scanner;
class PrimePerfect
{
	int upperLimit;
	int lowerLimit;
	void prime(int num1 , int num2)
	{
		
		boolean flag = false;
		for(int i = lowerLimit; i <= upperLimit; i++)
		{
			for(int j = 2; j <= (i/2); j++)
			{
				if( i % j == 0)
				{
					flag = true;	
				}
			}
			if(flag == false &&  i != 1)
			{
				System.out.println("Number is Prime"+i);
			}
			
		}
	}
	void perfect(int num1 , int num2)
	{
		System.out.println("perfect NUMBER:");
		
		for(int i = lowerLimit; i <= upperLimit; i++)
		{
				
			int a = 0;
			for(int j = 1;j <= i/2;j++)								{
				if(i % j == 0)
				{
					a = a + j;
				}
	
			}
		
			if(a == i)
			{
				System.out.println(i);

			}
			
		}
						
	}
	public static void main(String args[])
	{
		PrimePerfect num = new PrimePerfect();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range: ");
		num.lowerLimit = scan.nextInt();
		num.upperLimit = scan.nextInt();
		if(num.upperLimit < num.lowerLimit)
		{
			System.out.println("Invalid Input");
		}
		else
		{	
			num.prime(num.lowerLimit , num.upperLimit);
			num.perfect(num.lowerLimit , num.upperLimit);
		}
		 		
	}
}