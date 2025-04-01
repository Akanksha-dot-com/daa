class AreaCalc
{
	int length;
	int breath;
	int radius;
	int height;
	int base;
	void input()
	{
		System.out.println("input is being called");
	}
	public static void main(String args[])
	{
		int rec,sqr,tri;
		double cir;
		AreaCalc a1 = new AreaCalc();
		a1.length = Integer.parseInt(args[0]);
		a1.breath = Integer.parseInt(args[1]);
		a1.radius = Integer.parseInt(args[2]);
		a1.height = Integer.parseInt(args[3]);
		a1.base = Integer.parseInt(args[4]);
		a1.input();
		rec = a1.length*a1.breath;
		sqr = a1.length*a1.breath;
		cir = 3.14 * a1.radius;
		tri = (a1.base * a1.height)/2;
		System.out.println("Area of RECTANGLE : "+rec );	
		System.out.println("Area of SQUARE : "+sqr );
		System.out.println("Area of CIRCLE: "+cir);
		System.out.println("Area of TRIANGLE : "+tri);
	}
}
