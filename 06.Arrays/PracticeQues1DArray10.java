//Read N and N integers, then print only the first K elements (read K). If K > N, print all N. 
// Aim: bounds checks.

import java.util.Scanner;

public class PracticeQues1DArray10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the size of array: ");
        int n = input.nextInt();
        System.out.println("enter the element: ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter the first K elements to print: ");
        int k = input.nextInt();
        boundChecks(arr, n, k);
    }

    static void boundChecks(int[] arr, int n, int k) {
        if (k > n) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
