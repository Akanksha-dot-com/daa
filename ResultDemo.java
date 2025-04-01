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

class Result extends Student
{
	public Result(String name, int roll, int sub1, int sub2, int sub3) 
	{
        	super(name, roll, sub1, sub2, sub3);
	}
	public void result(int min) 
	{
        	if (m.sub1 >= min && m.sub2 >= min && m.sub3 >= min)
		{
            		System.out.println("Pass");
        	} 
		else 
		{
            		System.out.println("Fail");
        	}
   	}
 	public void result(int min, int merit)
	{
        	if (m.sub1 >= min && m.sub2 >= min && m.sub3 >= min)
		{
            		float avg = m.calcAvg();
            		if (avg >= merit)
			{
               			System.out.println("Pass with Scholarship Eligibility");
            		} 
			else 
			{
                		System.out.println("Pass (No Scholarship)");
            		}
        	} 
		else 
		{
            		System.out.println("Fail");
       		}
    	}
}
public class ResultDemo
{
    	public static void main(String[] args) 
	{
        	Scanner scan = new Scanner(System.in);

        	System.out.println("Enter the name of the student:");
        	String name = scan.nextLine();

        	System.out.println("Enter the roll number:");
        	int roll = scan.nextInt();

        	System.out.println("Enter marks for three subjects:");
        	int sub1 = scan.nextInt();
        	int sub2 = scan.nextInt();
        	int sub3 = scan.nextInt();

                Result student = new Result(name, roll, sub1, sub2, sub3);

     
        	student.showMarklist();
        	student.showAvg();

        	System.out.println("Enter the minimum marks: ");
		int min = scan.nextInt();
	        student.result(min);
		System.out.println("Enter the marks for scholarship: ");
		int scr = scan.nextInt();
                student.result(min, scr);

    }
}


	

