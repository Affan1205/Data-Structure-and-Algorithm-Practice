//Count how many elements are even in the matrix. Aim: nested loop + condition.

import java.util.Scanner;

public class PracticeQues2DArray04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the row :");
        int r = input.nextInt();
        System.out.println("enter the col :");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
                if (arr[row][col] % 2 == 0) { // count even numbers
                    count++;
                }
            }
        }
        System.out.println("Even numbers in matrix are: " + count);
    }
}
