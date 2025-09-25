// Compute the sum of main diagonal, sum of secondary diagonal, and absolute difference. 
// Aim: two patterns in one pass.

import java.util.Scanner;

public class PracticeQues2DArray12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println("enter the elements : ");
        int sumMain = 0;
        int sumDiagonal = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=input.nextInt();
                if (row == col) {
                    sumMain += arr[row][col];
                }
                if (row + col == arr.length - 1) {
                    sumDiagonal += arr[row][col];
                }
            }
        }
        System.out.println( Math.abs(sumDiagonal-sumMain));
    }
}
// 1 2 3 4 5 6 7 8 9