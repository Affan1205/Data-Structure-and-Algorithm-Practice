// Find if a number is palindrome or not

import java.util.Scanner;

public class PracticeQues17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("entr the input : ");
        int num = input.nextInt();
        boolean result = isPlaindrome(num);
        if (result) {
            System.out.println(num + " is Palindrome.");
        } else {
            System.out.println(num + " is not a Palindrome.");
        }
    }

    static boolean isPlaindrome(int n) {
        int temp = n;
        int ans = 0;
        while (temp != 0) {
            int digit = temp % 10;
            ans = ans * 10 + digit;
            temp = temp / 10;

        }
        if (ans != n) {
            return false;
        }
        return true;
    }
}
