import java.util.Scanner;

class ArrayMenu {
    int arr[][];
    int row;
    int col;

    ArrayMenu() {
        this.row = this.col = 3;
        arr = new int[row][col];
    }

    ArrayMenu(int row, int col) {
        this.row = row;
        this.col = col;
        arr = new int[row][col];
    }

    ArrayMenu add(ArrayMenu op2) {
        if (this.row != op2.row || this.col != op2.col) {
            System.out.println("ARRAYS ARE NOT SUITABLE FOR ADDITION");
            return new ArrayMenu(0, 0);
        }

        ArrayMenu temp = new ArrayMenu(this.row, this.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                temp.arr[i][j] = this.arr[i][j] + op2.arr[i][j];
            }
        }
        return temp;
    }

    ArrayMenu sub(ArrayMenu op2) {
        if (this.row != op2.row || this.col != op2.col) {
            System.out.println("ARRAYS ARE NOT SUITABLE FOR SUBTRACTION");
            return new ArrayMenu(0, 0);
        }

        ArrayMenu temp = new ArrayMenu(this.row, this.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                temp.arr[i][j] = this.arr[i][j] - op2.arr[i][j];
            }
        }
        return temp;
    }

    ArrayMenu mul(ArrayMenu op2) {
        if (this.col != op2.row) {
            System.out.println("ARRAYS ARE NOT SUITABLE FOR MULTIPLICATION");
            return new ArrayMenu(0, 0);
        }

        ArrayMenu temp = new ArrayMenu(this.row, op2.col);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < op2.col; j++) {
                temp.arr[i][j] = 0;
                for (int k = 0; k < this.col; k++) {
                    temp.arr[i][j] += this.arr[i][k] * op2.arr[k][j];
                }
            }
        }
        return temp;
    }

    void trans() {
        int[][] temp = new int[this.col][this.row];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                temp[j][i] = this.arr[i][j];
            }
        }
        this.arr = temp;
        int t = this.row;
        this.row = this.col;
        this.col = t;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                arr[i][j] = scan.nextIn t();
            }
        }
    }

    void display() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayMenu a1, a2, a3;

        System.out.println("Enter the number of rows for array 1: ");
        int row1 = scan.nextInt();
        System.out.println("Enter the number of columns for array 1: ");
        int col1 = scan.nextInt();
        a1 = new ArrayMenu(row1, col1);

        System.out.println("Enter the number of rows for array 2: ");
        int row2 = scan.nextInt();
        System.out.println("Enter the number of columns for array 2: ");
        int col2 = scan.nextInt();
        a2 = new ArrayMenu(row2, col2);

        do {
            System.out.println("1.DISPLAY\n2.ADDITION\n3.SUBTRACTION\n4.MULTIPLICATION\n5.TRANSPOSE\n6.EXIT");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    a1.display();
                    break;
                case 2:
                    System.out.println("Enter elements for array 1:");
                    a1.input();
                    System.out.println("Enter elements for array 2:");
                    a2.input();
                    a3 = a1.add(a2);
                    a3.display();
                    break;
                case 3:
                    a3 = a1.sub(a2);
                    a3.display();
                    break;
                case 4:
                    a3 = a1.mul(a2);
                    a3.display();
                    break;
                case 5:
                    a1.trans();
                    a1.display();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
