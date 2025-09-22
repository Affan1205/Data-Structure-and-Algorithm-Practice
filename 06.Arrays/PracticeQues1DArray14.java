//Read N and N integers, then print the first and last elements; if N = 1, print the same element twice. Aim: index edges.

import java.util.Scanner;

public class PracticeQues1DArray14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the input: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        firstAndlast(arr, n);
    }

    static void firstAndlast(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (n == 1) {
                System.out.println(arr[i] + " " + arr[i]);
            } else if (i == 0) {
                System.out.println(arr[i]);
            } else if (i == arr.length - 1) {
                System.out.println(arr[i]);
            }
        }
    }

}
