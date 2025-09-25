//Print the border elements of the matrix in clockwise order (top row, right column, bottom row reverse, left column reverse).
//  Aim: careful bounds checks.

import java.util.Scanner;

public class PracticeQues2DArray13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of  row: ");
        int r = input.nextInt();
        System.out.println("enter the size of  col: ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter the element in 2D array: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();// taking inputs
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        
        // Printing toprow
        for (int col = 0; col < c; col++) {
            System.out.print(arr[0][col] + " ");
            
        }
        System.out.println();
        
        // Printing rightrcolumn
        for (int row = 1; row < r; row++) {
            System.out.print(arr[row][c - 1] + " ");
            
        }
        System.out.println();
        // Printing bottom row
        for (int col = c - 2; col >= 0; col--) {
            System.out.print(arr[r - 1][col] + " ");
        }
        System.out.println();
        // Printing lefr column
        for (int row = r - 2; row >= 1; row--) {
            System.out.print(arr[row][0] + " ");
        }
        System.out.println();
        
    }
}
// ----------PRINT BORDER ARRAY---------
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.println("enter the size of row: ");
// int r = input.nextInt();
// System.out.println("enter the size of col: ");
// int c = input.nextInt();
// int[][] arr = new int[r][c];
// System.out.println("enter the element in 2D array: ");
// for (int row = 0; row < arr.length; row++) {
// for (int col = 0; col < arr[row].length; col++) {
// arr[row][col] = input.nextInt();
// }
// }
// System.out.println("-------------Border Array ---------------");
// for (int row = 0; row < r; row++) {
// for (int col = 0; col < r; col++) {
// if (row == 0 || row == r - 1 || col == 0 || col == c - 1) {
// System.out.print(arr[row][col] + " ");
// }
// }
// System.out.println();
// }

// }
