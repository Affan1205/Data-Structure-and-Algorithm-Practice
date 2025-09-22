//Read N and N integers, then print them in reverse order. 
// Aim: reverse iteration without modifying array.

import java.util.Scanner;

public class PracticeQues1DArray03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Reverse order of array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
