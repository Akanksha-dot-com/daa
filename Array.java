import java.util.Scanner;

class Array {
    int[][] arr;

    void input() {
        Scanner scan = new Scanner(System.in);
        arr = new int[3][2]; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the element for position: ");
                arr[i][j] = scan.nextInt();
            }
        }
    }

    void display() {
        System.out.println("Elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    int sum() {
        int sum = 0;
        for (int[] row : arr) {
            for (int element : row) {
                sum += element;
            }
        }
        return sum;
    }

    int sub() {
        int sub = 0;
        for (int[] row : arr) {
            for (int element : row) {
                sub -= element;
            }
        }
        return sub;
    }

    int multiply() {
        int mul = 1;
        for (int[] row : arr) {
            for (int element : row) {
                mul *= element;
            }
        }
        return mul;
    }
    void transpose()
    {
	 System.out.println("Transpose of the array:");
         for (int i = 0; i < arr[0].length; i++) 
	{
            for (int j = 0; j < arr.length; j++) 
		{
                System.out.print(arr[j][i] + " ");
            	}
            System.out.println();
    	}
}


    public static void main(String[] args) {
        Array a1 = new Array();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("________________________________");
            System.out.println("1.Input array");
            System.out.println("2.Display array");
            System.out.println("3.Calculate sum of elements");
            System.out.println("4.Calculate subtraction of elements");
            System.out.println("5.Calculate multiplication of elements");
            System.out.println("6.Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    a1.input();
                    break;
                case 2:
                    a1.display();
                    break;
                case 3:
                    System.out.println("Sum of elements: " + a1.sum());
                    break;
                case 4:
                    System.out.println("Subtraction of elements: " + a1.sub());
                    break;
                case 5:
                    System.out.println("Multiplication of elements: " + a1.multiply());
                    break;
		case 6:
		    System.out.println("Transpose of the matrix is: + a1.transpose());
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
