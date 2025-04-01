class EvenOdd
{
	int num;
	void check(int num)
	{
		if(num % 2 == 0)
		{
			System.out.println("even number : "+num);
		}
		else
		{
			System.out.println("odd number : "+num);
		}
	}
	public static void main(String args[])
	{
		EvenOdd n1 = new EvenOdd();
		n1.num = Integer.parseInt(args[0]);
		System.out.println("Checking for number........\n");
		n1.check(n1.num);
		System.out.println("\ndone");
	}
}
