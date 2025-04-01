import java.util.Scanner;
Class Stack
{
	int stack[10];
	int top;
	void push(int num,int top)
	{
		if(top >= 10)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top = top + 1;
			stack[top] = num;
		}
	}
	int pop(int top)
	{
		int temp;
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return -111;
		}
		else
		{
			temp = stack[top];
			top = top - 1;
			return temp;
			
		}
	}
	void display()
	{
		int i;
		for(i = 0 ; i < stack.length; i++)
		{
			System.out.println("stack["+i+"] = " +stack[i]);
		}
	}
	public static void main(String args[])
	{
			top = -1;
			int x,i,y;
			Stack s1 = new Stack();
			Scanner scan = new Scanner(System.in);
			for(i = 0; i < 10; i++)
			{
				x = scan.nextInt();
				s1.push(x,top);
			}
			s1.display();
			y = pop(top);
			if(y == 0)
			{
				System.out.println("NO NUMBER DEQUEUED");
			}
			else
			{
				system.out.println("Number dequeued is: "+y);
			}
		}
}

	