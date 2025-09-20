// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class PracticeQues13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input (exit 0)");
        int max = Integer.MIN_VALUE;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("maximum of enter input is " + max);
    }
}
