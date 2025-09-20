// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PracticeQues08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input :");
        String str = input.nextLine();
        boolean result = isPalindrome(str);
        if (result) {
            System.out.println(str + " is Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }

    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
