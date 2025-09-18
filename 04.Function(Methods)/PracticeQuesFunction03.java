
//A person is eligible to vote if his/her age is greater than or equal to 18.
//  Define a method to find out if he/she is eligible to vote.
import java.util.Scanner;

public class PracticeQuesFunction03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        boolean result = isEligible(age);
        if (result) {
            System.out.println("You can vote.");
        } else {
            System.out.println("Your age is less than 18, can't vote.");
        }
    }

    static boolean isEligible(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }

    }
}
