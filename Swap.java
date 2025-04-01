class Swap
{
	int num1,num2;
	public static void main(String args[])
	{
		int temp;
		Swap s1 = new Swap();
		s1.num1 = Integer.parseInt(args[0]);
		s1.num2 = Integer.parseInt(args[1]);

		System.out.println("Before Swap");

		System.out.println("num1: "+s1.num1);
		System.out.println("num2: "+s1.num2);

		temp = s1.num1;
		s1.num1 = s1.num2;
		s1.num2 = temp;
		
		System.out.println("after Swap1");


		System.out.println("num1: "+s1.num1);
		System.out.println("num2: "+s1.num2);

		
		s1.num1 = s1.num1 + s1.num2;
		s1.num2 = s1.num1 - s1.num2;
		s1.num1 = s1.num1 - s1.num2;
		
		
		System.out.println("after Swap2");


		System.out.println("num1: "+s1.num1);
		System.out.println("num2: "+s1.num2);
	}
}



	
