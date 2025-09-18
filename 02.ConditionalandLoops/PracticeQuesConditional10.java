// Write a program to print the sum of negative numbers, sum of positive even numbers and 
// the sum of positive odd numbers from a list of numbers (N) entered by the user. 
// The list terminates when the user enters a zero.

import java.util.Scanner;

public class PracticeQuesConditional10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entet the input ");
        int negativeSum = 0;
        int evenPositive = 0;
        int oddPositive = 0;
        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            } else {
                if (num < 0) {
                    negativeSum += num;
                } else {
                    if (num % 2 == 0) {
                        evenPositive += num;
                    } else {
                        oddPositive += num;
                    }
                }
            }
        }
        System.out.println("negativeSum " + negativeSum);
        System.out.println("even positive sum " + evenPositive);
        System.out.println("odd positive sum " + oddPositive);
    }

}
