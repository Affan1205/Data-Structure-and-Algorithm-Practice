// Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class PracticeQues04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
        double num1 = input.nextDouble();
        System.out.println("enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("choose operation(+, -, *, /) ");
        char ch = input.next().trim().charAt(0);
        double reult = calculateValue(num1, num2, ch);
        if (reult == 0) {
            System.out.println("Error: invalid operation or divide by zero.");
        } else {
            System.out.println("Result " + reult);
        }
    }

    static double calculateValue(double num1, double num2, char ch) {
        switch (ch) {
            case '+':
                return num1 + num2;
            case '*':
                return num1 + num2;
            case '-':
                return num1 + num2;
            case '/':
                if (num2 == 0) {
                    return 0;
                }
                return num1 / num2;
            default:
                return 0;

        }
    }
}
