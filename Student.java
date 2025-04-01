class Student1
{
	int roll;
	String name,cls;
	float cgpa;
	String grade;
	void input()
	{
		System.out.println("input called");
	}
	void display()
	{
		System.out.println("display called");
		System.out.println("name "+name);
		System.out.println("roll "+roll);
		System.out.println("CGPA"+cgpa);
		System.out.println("class"+cls);
		System.out.println("grade "+grade);
	}

	public static void main(String args[])
	{
		int i;
		for(i = 0 ; i < args.length; i++)
		{
			System.out.println("Args["+i+"] = " +args[i]);
		}
		Student s1 = new Student1();
		s1.name = args[0];
		s1.cls = args[1];
		s1.grade  = args[2];
		s1.roll = Integer.parseInt(args[3]);
		s1.cgpa = Float.parseFloat(args[4]);
		s1.input();
		s1.display();

	}



}