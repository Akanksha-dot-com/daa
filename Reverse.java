import java.util.Scanner;
class Reverse
{
	String s;
	void rev()
	{
		int n = s.length();
		char[] rev1 = new char[n];
		for(int i = 0 ; i < s.length();i++)
		{
			rev1[s.length() - 1  - i] = s.charAt(i);
		}
		for(char ch: rev1)
		{
			System.out.print(ch + " ");
		}
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
        	Reverse obj = new Reverse();
       		 System.out.println("Enter a string:");
       		 obj.s = scan.nextLine();
		obj.rev();
	}
}
			