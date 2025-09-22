//Read N and N integers, print how many times a given value X appears. Aim: frequency by scanning.

import java.util.Scanner;

public class PracticeQues1DArray06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter the elment to count its frequency: ");
        int num = input.nextInt();
        int result = countFrequency(arr, num);
        System.out.println("Frequency of " + num + " is " + result);
    }

    static int countFrequency(int[] arr , int num){
        int count=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == num) {
        //     count++;
        //     }
        // }
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }

}
