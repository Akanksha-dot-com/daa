import java.util.Scanner;
class Student
{
	public String name;
	public int roll;
	Marklist m;
	Student()
	{
		name = "xyz";
		roll = 123;
		Marklist m = new Marklist();
	}
	Student(String name,int roll)
	{
		this.name = name;
		this.roll = roll;
		Marklist m = new Marklist();
	}
	void showMarklist()
	{
		System.out.println("Student name: "+this.name);
		System.out.println("roll number: "+this.roll);
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("subject marks: "+m
}
class Marklist
{
	public int list[][];
	Marklist()
	{
		Scanner scan = new Scanner(System.in);
		list = new int[3][2];
		for( int i = 0; i < 3; i++)
		{
			list[i][0] = i;
			list[i][1] = scan.nextInt(); 
		}	
	}
	Marklist(int sub1,int sub2,int sub3)
	{
		list = new int[3][2];
		for(int i = 0; i < 3; i++)
		{
			list[i][0] = i;	
		}
		list[0][1] = sub1;
		list[1][1] = sub2;
		list[2][1] = sub3;
	}
	float calcAvg()
	{
		float avg= 0.0f;
		for(int i = 0; i < 3; i++)
		{
			avg += (float)list[i][1];
		}
		return avg;
	}
}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int roll = scan.nextInt();
		Student s1 = new Student(name,roll);
		
		
		

	}
}
		
	
	
		 
