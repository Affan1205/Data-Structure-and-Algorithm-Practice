//Factorial of an number.

import java.util.Scanner;

public class PracticeQues14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input: ");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("Factorial of " + num + " is = 1");
        }
        if (num < 0) {
            System.out.println("Invalid input!!");
        }
        long ans = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is " + ans);
    }

    static long calculateFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
