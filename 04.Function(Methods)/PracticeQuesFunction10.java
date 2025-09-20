//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class PracticeQuesFunction10 {
    public static void main(String[] args) {


        boolean result = isPalindrome(444333444);
        if (result) {
            System.out.println(" is Palindrome.");
        } else {
            System.out.println(" not a Palindrome.");
        }
    }
    static boolean isPalindrome(int num) {
        int temp = num;
        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        if (ans == temp) {
            return true;
        } else {

            return false;
        }
    }
}
