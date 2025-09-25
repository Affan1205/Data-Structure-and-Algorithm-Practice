//Compute and print the sum of each column on separate lines. Aim: outer loop on columns.

import java.util.Scanner;

public class PracticeQues2DArray08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for (int col = 0; col < 3; col++) {
            int sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += arr[row][col];
            }
            System.out.println(sum);
        }
    }
}
