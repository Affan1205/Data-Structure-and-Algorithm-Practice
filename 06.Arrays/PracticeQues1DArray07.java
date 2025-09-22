//Read N and N integers, print the sum of all elements. Aim: running total.

import java.util.Scanner;

public class PracticeQues1DArray07 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }
        int result = sum(arr);
        System.out.println("Sum of all elements of array are : " + result);
    }
    static int sum(int[] arr)
    {
        int sum = 0 ;
        // for (int i = 0; i < arr.length; i++) {
        //     sum+=arr[i];
        // }
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
