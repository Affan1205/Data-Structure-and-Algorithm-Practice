//Print the matrix row-wise on one line per row, then column-wise (top to bottom). 
// Aim: row-major vs column-major iteration.

import java.util.Scanner;

public class PracticeQues2DArray02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the row size: ");
        int r = input.nextInt();
        System.out.print("enter the col size: ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        // Printing row wise
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        // Printing col wise
        for (int col = 0; col < c; col++) {
            for (int row = 0; row < r; row++) {
                System.out.println(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
