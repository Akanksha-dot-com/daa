import java.util.Scanner;


class Student
{
	public String name;
	public int roll;
	MarkList m;
	Student()
	{
		name = "xyz";
		roll = 123;
		m = new MarkList();
	}
	Student(String name,int roll,int sub1,int sub2,int sub3)
	{
		this.name = name;
		this.roll = roll;
		m = new MarkList(sub1,sub2,sub3);
	}
	void showMarklist()
	{
		System.out.println("Student name: "+this.name);
		System.out.println("roll number: "+this.roll);
		String str = m.toString();
		System.out.println(str);
	}
	void showAvg()
	{
		float avg = m.calcAvg();
		System.out.println("Average: "+avg);	
	} 		
}
class MarkList
{
	public int sub1;
	public int sub2;
	public int sub3;
	public MarkList()
	{
		this.sub1 = 0;
		this.sub2 = 0;
		this.sub3 = 0;
	}
	public MarkList(int sub1,int sub2,int sub3)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	float calcAvg()
	{
		float avg= 0.0f;
		avg = (sub1+sub2+sub3)/3.0f;
		return avg;
	}
	public String toString()
	{
		return "Marks obtained are "+ this.sub1 + " " + this.sub2 + " " + this.sub3;
	}
}
public class MarkListDemo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		Student sA = new Student();
		System.out.println("Enter the name of the student");
		String str = scan.nextLine();
		System.out.println("Enter the roll of the student");
		int r = scan.nextInt();
		System.out.println("Enter the marks of the student: ");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		Student s = new Student(str,r,s1,s2,s3);
		s.showMarklist();
		s.showAvg();
	}
}

		
	
