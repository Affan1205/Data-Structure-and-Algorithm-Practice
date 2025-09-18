//Take in two numbers and an operator (+, -, *, /) and calculate the value. 

import java.util.Scanner;

public class PracticeQuesJava4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        float num1 = input.nextFloat(), num2 = input.nextFloat();
        System.out.println("select the operation + , - , * , / ");
        char ch = input.next().charAt(0);
        if (ch == '+') {
            float sum = num1 + num2;
            System.out.println("sum is = " + sum);
        } else if (ch == '-') {
            float diff = num1 - num2;
            System.out.println("difference is " + diff);
        } else if (ch == '*') {
            float multi = num1 * num2;
            System.out.println("multiplication is " + multi);
        } else if (ch == '/') {
            if (num2 == 0) {
                System.out.println("Invalid ! Try Again.");
            }
            float div = num1 / num2;
            System.out.println("difference is " + div);
        }

  }
}
