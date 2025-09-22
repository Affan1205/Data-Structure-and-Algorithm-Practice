//Read N and N integers, then print them each on a new line with their index like: index 0 -> value.
//  Aim: index access.

import java.util.Scanner;

public class PracticeQues1DArray02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i + " -> " + arr[i]);
        }
        
    }
}
