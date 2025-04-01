import java.util.Scanner;
class Avgtypecaste
{
	public static void main(String args[])
	{
		byte b1,b2,b3;
		float ans;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter  number");
		b1 =  scan.nextByte();
		System.out.println("enter  number");
		b2 = scan.nextByte();
		System.out.println("enter  number");
		b3 = scan.nextByte();
		ans = (float)((b1+b2+b3)/3.0);
		System.out.println("answer is  " +ans);
	}
}

		