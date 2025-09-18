
// Define a method that returns the product of two numbers entered by user.
import java.util.Scanner;

public class PracticeQuesFunction05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = product(num1, num2);
        System.out.println("Product of " + num1 + " and " + num2 + " is " + ans);

    }

    static int product(int a, int b) {
        return a * b;
    }
}
