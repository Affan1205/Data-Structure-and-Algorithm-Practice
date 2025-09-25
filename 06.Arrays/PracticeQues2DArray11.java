// Print the secondary diagonal elements (i + j == N-1). Aim: index sum pattern.

import java.util.Scanner;

public class PracticeQues2DArray11 {
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
            for (int col = 0; col < arr[row].length; col++) {
                if ((row + col) == arr.length - 1) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
