//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PracticeQuesJava8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the input");
        String str = input.next();
        boolean isPalindrome = true;
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println(str + " is Palindrome.");
        } else {
            System.out.println(str + " is not Palindrome.");
        }

    }
}

//