import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrayInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);// gives -> number of rows
        
        // Input using for loop
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

        // Printing using for loop
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Printing using -> toString()
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Printing using for each loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
