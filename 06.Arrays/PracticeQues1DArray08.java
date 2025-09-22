// Read N and N integers, print the average as a floating number with 2 decimals.
// Aim: cast before division.

import java.util.Scanner;

public class PracticeQues1DArray08 {
    public static void main(String[] args) {
 Scanner input =new Scanner(System.in);
        float[] arr = new float[5];
        System.out.println("enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextFloat();
        }
        float result = sum(arr);
        System.out.println("Average of all elements of array are : " + result/5);
    }
    static float sum(float[] arr)
    {
        float sum = 0 ;
        // for (int i = 0; i < arr.length; i++) {
        //     sum+=arr[i];
        // }
        for (float i : arr) {
            sum+=i;
        }
        return sum;
    }
}
