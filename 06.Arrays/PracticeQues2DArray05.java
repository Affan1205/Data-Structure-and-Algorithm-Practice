//Find the maximum and minimum element in the matrix. Aim: track while reading or in a single pass.

import java.util.Scanner;

public class PracticeQues2DArray05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int r = input.nextInt();
        System.out.println("enter the col :");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
                if (arr[row][col] > max) {
                    max = arr[row][col];
                } 
                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }
        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);
    }
}
