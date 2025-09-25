//For an N×N matrix, print the main diagonal elements (i == j). Aim: matching indices.

import java.util.Scanner;

public class PracticeQues2DArray10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print("enter the element in array: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col= 0;col < arr[row].length; col++) {
                if (row== col) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}