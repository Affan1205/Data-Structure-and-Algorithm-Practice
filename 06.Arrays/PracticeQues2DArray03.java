// Read R, C, matrix, then print all elements in a single line separated by spaces. 
// Aim: flatten with nested loops.

import java.util.Scanner;

public class PracticeQues2DArray03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the rrow size: ");
        int r = input.nextInt();
        System.out.println("enter the col size: ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
