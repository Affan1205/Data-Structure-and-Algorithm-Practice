// Given X, print YES if X appears anywhere, else NO. Aim: early exit once found.

import java.util.Scanner;

public class PracticeQues2DArray06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {
                { 77, 13, 30 },
                { 1, 51, 43, },
                { 66, 73, 14 }
        };
        System.out.println("enter the element to check its presence: ");
        int num = input.nextInt();
        boolean isFound = false;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == num) {
                    isFound = true;
                    break;
                }

            }
        }
        if (isFound) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }

    }
}
