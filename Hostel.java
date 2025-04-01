class Hostel
{
	int rooms;
	String name;
	int totalStudents;
	void input()
	{
		System.out.println("\nInput is being called");
	}
	void display()
	{
		System.out.println("\nNumber of rooms"+rooms);
		System.out.println("\nName of hostel : "+name);
		System.out.println("\nTotal number of students :"+totalStudents);
	}
	public static void main(String args[])
	{
		int i,c;
		for(i = 0; i < args.length; i++)
		{
			System.out.println("Args["+i+"] = "+args[i]);
		}
		Hostel h1 = new Hostel();
		h1.rooms = Integer.parseInt(args[0]);
		h1.name = args[1];
		h1.totalStudents = Integer.parseInt(args[2]);
		c = h1.totalStudents/h1.rooms;
		System.out.println("number of students in a room "+c);
		h1.input();
		h1.display();
	}
}

	

	