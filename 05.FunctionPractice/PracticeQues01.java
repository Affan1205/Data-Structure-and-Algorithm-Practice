//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class PracticeQues01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the input : ");
        int num = input.nextInt();
        boolean result = isEvenOdd(num);
        if (result) {
            System.out.println(num + " is even .");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    static boolean isEvenOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

}
