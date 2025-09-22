// Read N and N integers, print the minimum and maximum values. Aim: track while reading.

import java.util.Scanner;

public class PracticeQues1DArray09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int maxValue = getMaximum(arr);
        System.out.println("Maximum element is: " + maxValue);
        int minValue = getMinimum(arr);
        System.out.println("Minimum element is: " + minValue);
    }

    static int getMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int getMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
