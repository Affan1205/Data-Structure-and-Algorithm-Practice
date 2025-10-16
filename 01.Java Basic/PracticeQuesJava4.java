//Take in two numbers and an operator (+, -, *, /) and calculate the value. 

import java.util.Scanner;

public class PracticeQuesJava4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        float num1 = input.nextInt();
        float num2 = input.nextInt();
        System.out.println("enter the opertion(+, -, *, /): ");
        char operator = input.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("number can't divide by 0.");
            } else {
                System.out.println(num1 / num2);
            }
        } else {
            System.out.println("Invalid Input!!!!");
        }

    }

}
