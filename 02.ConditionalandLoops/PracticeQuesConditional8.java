
//Perfect Number
import java.util.Scanner;

public class PracticeQuesConditional8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = input.nextInt();
        int sum = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num1) {
            System.out.println(num1 + " is perfect number.");
        } else {
            System.out.println(num1 + " is not a perfect number.");
        }
    }
}
