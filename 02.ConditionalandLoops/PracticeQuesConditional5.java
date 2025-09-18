
// Find if a number is palindrome or not
import java.util.Scanner;

public class PracticeQuesConditional5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number.");
        int num = input.nextInt();
        System.out.println("reverse of " + num + " is : ");
        int ans = 0;
        int temp = num;
        while (num != 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        System.out.println(ans);
        if (ans == temp) {
            System.out.println(temp + " is Palindrome");
        } else {
            System.out.println(temp + " not a palindrome.");
        }
    }
}
