
//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;

public class PracticeQuesFunction02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = input.nextInt();
        boolean Result = isEvenOdd(num);
        if (Result) {
            System.out.println(num + " is even number.");
        } else {
            System.out.println(num + " is even number.");

        }
    }

    static boolean isEvenOdd(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
