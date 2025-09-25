// Read R, C, then an R×C matrix and print it in the same grid format with spaces between columns. 
// Aim: nested loops I/O.

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQues2DArray01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter the row size: ");
        int row = input.nextInt();
        System.out.print("enter the col size: ");
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        for (int r = 0; r < arr.length; r++) {// arr.length -> no. of rows
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = input.nextInt();
            }
        }

        for (int r = 0; r < arr.length; r++) {// arr.length -> no. of rows
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------");
        // using to string
        for (int r = 0; r < arr.length; r++) {// arr.length -> no. of rows

            System.out.println(Arrays.toString(arr[r]));
        }

        System.out.println("-----------------");
        // using for each loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
