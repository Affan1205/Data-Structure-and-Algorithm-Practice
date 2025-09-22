// Read N and N integers, then print them in the same order on one line separated by spaces. 
// Aim: simple for-loop I/O


import java.util.Arrays;
import java.util.Scanner;

public class PracticeQues1DArray01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("enter inputs of array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // Printing using for loop
        System.out.print("Elements of array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Printing using for each loop
        System.out.print("Elements of array are : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Printing using for To.string
        System.out.print("Elements of array are : ");
        System.out.println(Arrays.toString(arr));

    }
}
