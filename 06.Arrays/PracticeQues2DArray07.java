// Compute and print the sum of each row on separate lines. Aim: reset running total per row.

import java.util.Scanner;

public class PracticeQues2DArray07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the element of array: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            System.out.println("Sum of row " + row + " is " + sum);
        }

    }
}
