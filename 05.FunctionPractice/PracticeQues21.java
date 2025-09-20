//Write a program to print the sum of negative numbers, sum of positive even numbers 
// and the sum of positive odd numbers from a list of numbers (N) entered by the user.
//  The list terminates when the user enters a zero.

import java.util.Scanner;

public class PracticeQues21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the input(exit 0)");
        int negSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                negSum += num;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
        }
        System.out.println("sum of negative number " + negSum);
        System.out.println("sum of positive even number " + evenSum);
        System.out.println("sum of positive odd number " + oddSum);
    }
}
