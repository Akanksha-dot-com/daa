import java.util.Scanner;

class Matrix {
    int matrix[][];
    int row;
    int col;

    // Default Constructor
    Matrix() {
        row = 3;
        col = 3;
        matrix = new int[row][col];
    }

    // Parameterized Constructor
    Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
    }

    // Method to check if the matrix is diagonal
    void isDiagonal() {
        boolean flag = true;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i != j && matrix[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("The matrix is a diagonal matrix");
        else
            System.out.println("The matrix is not a diagonal matrix");
    }

    // Method to check if the matrix is upper triangular
    void isUpperTriangular() {
        boolean flag = true;

        for (int i = 1; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("The matrix is an upper triangular matrix");
        else
            System.out.println("The matrix is not an upper triangular matrix");
    }

    // Method to check if the matrix is lower triangular
    void isLowerTriangular() {
        boolean flag = true;

        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) {
                if (matrix[i][j] != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("The matrix is a lower triangular matrix");
        else
            System.out.println("The matrix is not a lower triangular matrix");
    }

    // Method to check if the matrix is symmetric
    void isSymmetric() {
        if (row != col) {
            System.out.println("The matrix is not symmetric (not a square matrix)");
            return;
        }

        boolean flag = true;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < col; j++) { // Only check the upper triangle
                if (matrix[i][j] != matrix[j][i]) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag)
            System.out.println("The matrix is symmetric");
        else
            System.out.println("The matrix is not symmetric");
    }

    // Method to take user input for the matrix
    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        // Scanner is not closed to avoid closing System.in
    }

    // Method to display the matrix
    void display() {
        System.out.println("Matrix:");
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Matrix obj = new Matrix(3, 3); // Define a 3x3 matrix

        obj.input();   // Get user input
        obj.display(); // Display the matrix

        obj.isDiagonal();        
        obj.isUpperTriangular();
        obj.isLowerTriangular();
        obj.isSymmetric();    
    }
}
