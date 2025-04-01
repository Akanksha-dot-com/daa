import java.lang.*;
class SampleThread implements Runnable
{
	public void run()
	{
		for(int i = 0; i < 5; i++)
			System.out.println("Hello World");	
	}
}
public class MyThread
{
	public static void main(String args[])
	{
		SampleThread thrd = new SampleThread();
		Thread newThread = new Thread(thrd);
		newThread.start();
	}
}