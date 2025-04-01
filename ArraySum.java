import java.util.Scanner;
class ArraySum
{
 	int arr[][];
	ArraySum(){
		arr = new int[3][4];
	}
	void sum()
	{
		int rowSum,colSum;
		for(int i = 0 ; i < arr.length;i++)
		{	
			rowSum = 0 ;
			for(int j = 0 ; j < arr[i].length; j++)
				rowSum += arr[i][j];
			System.out.println("Sum of row "+(i+1)+" :"+rowSum);
		}
		for(int j = 0 ; j < arr[0].length;j++)
		{	
			colSum = 0 ;
			for(int i = 0 ; i < arr.length; i++)
				colSum += arr[i][j];
			System.out.println("Sum of col "+(j+1)+" : "+colSum);
		}
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		ArraySum obj = new ArraySum();
		System.out.println("Enter the element of the aray (3x4):");
		for( int i = 0; i < obj.arr.length ; i++)
		{
			for(int j = 0 ; j < obj.arr[i].length ; j++)
			{
				obj.arr[i][j] = scan.nextInt();
			}
		}
		obj.sum();
	}
}

	

		