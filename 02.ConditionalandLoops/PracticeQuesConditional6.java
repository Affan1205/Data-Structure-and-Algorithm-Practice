//Hcf

import java.util.Scanner;

public class PracticeQuesConditional6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("enter the second number: ");
        int num2 = input.nextInt();
        int n = Math.min(num1, num2);
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                if (i > max) {
                    max = i;
                }
            }
        }
        System.out.println("hcf of " + num1 + " and " + num2 + " is " + max);
    }
}
