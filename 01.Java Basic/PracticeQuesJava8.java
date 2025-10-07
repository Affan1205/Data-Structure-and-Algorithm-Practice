//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class PracticeQuesJava8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an input : ");
        String str = input.next();
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
            
        }
        if (isPalindrome) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not palindrome.");
        }
    }
}

//