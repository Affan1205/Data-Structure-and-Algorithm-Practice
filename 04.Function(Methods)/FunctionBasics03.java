//Integer Function with return statement

import java.util.Scanner;

public class FunctionBasics03 {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("sum is " + ans);
    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int addition = num1 + num2;
        return addition;
    }
}
