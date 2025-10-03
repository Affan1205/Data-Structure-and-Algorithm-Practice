//Take in two numbers and an operator (+, -, *, /) and calculate the value. 

import java.util.Scanner;

public class PracticeQuesJava4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 number: ");
        int num1 = input.nextInt(), num2 = input.nextInt();
        System.out.println("Enter the Operator(+, -, *, /) : ");
        char ch = input.next().charAt(0);
        if (ch == '+') {
            System.out.println(num1 + num2);
        } else if (ch == '-') {
            System.out.println(num1 - num2);
        } else if (ch == '*') {
            System.out.println(num1 * num2);
        } else if (ch == '/') {
            if (num2 == 0) {
                System.out.println("number can't divide by 0.");
            }
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid input!!");
        }

    }

}
