import java.util.Scanner;
class ReportCard
{
		int theory[];
		int practical[];
		float per;
		ReportCard()
		{
			theory = new int[5];
			practical = new int[5];	
		}
		void input()
		{
		
			for (int i : theory)
			{	
					t.println("Enter the marks for practical subjects");
				i = scan.nextInt();
			}
			for ( int i : practical)
			{
				i = scan.nextInt();
			}	
		}
			
		void per()
		{
			int totalNum = 500;
			int sum = 0;
			for(int i: theory)
				sum += i;
			for(int i : practical)
				sum += i;
			System.out.println("The calculated sum is: "+sum);
			per = (float)((sum/500.0)*100);
			System.out.println("The calculated percentage is: "+per);
			
		}
		void grade()
		{
			if( per < 33)
				System.out.println("Fail");
			else if(per >= 33 || per < 48)
				System.out.println("III Div");
			else if(per >= 48 || per < 59)
				System.out.println("II Div");
			else if(per >= 60 || per <= 75)
				System.out.println("I Div");
			else 
				System.out.println("Distinction");
				
		}
		void display()
		{
			System.out.println("subject Max Marks Obtained(theory) Max Marks Obtained(practical)");
			for(int i = 1; i <= 5; i++)
			{
				System.out.println("theory" +theory[i]);
				System.out.println("practical" +practical[i]);
			}
		}
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);
			ReportCard r1 = new ReportCard();
			r1.per();
			r1.grade();
		}
}
			
			


		
		