//Read N and N integers, print the count of numbers greater than a given X (read X after the array).
//  Aim: compare each element.

import java.util.Scanner;

public class PracticeQues1DArray05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter an element to check how many number are greater than input number: ");
        int num = input.nextInt();
        int result = countHowmanyGreater(arr, num);
        System.out.println(result + " numbers are greater than ");
    }

    static int countHowmanyGreater(int[] arr, int num) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                count++;
            }
        }

        // for (int i : arr) {
        //     if (i > num) {
        //         count++;
        //     }
        // }
        return count;
    }
}