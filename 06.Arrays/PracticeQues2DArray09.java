//Given a row index r, print that row; given a column index c, print that column. Aim: index access practice.

import java.util.Scanner;

public class PracticeQues2DArray09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print("enter the element in array: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        System.out.print("enter the index of row you want to print: ");
        int rowIndex = input.nextInt();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (row == rowIndex) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("enter the index of col you want to print: ");
        int colIndex = input.nextInt();
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                if (col == colIndex) {
                    System.out.println(arr[row][col] + " ");
                }
            }
        }
        System.out.println();
    }
}
