//Read N and N integers, print the count of numbers that are even. Aim: basic condition + count.

import java.util.Scanner;

public class PracticeQues1DArray04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elemets of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int result = countEven(arr);
        System.out.println("Total Even numbers in array " + result);

    }

    static int countEven(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}
