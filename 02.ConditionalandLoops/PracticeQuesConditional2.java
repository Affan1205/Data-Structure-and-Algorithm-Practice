
// Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class PracticeQuesConditional2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number.");
        int num = input.nextInt();
        System.out.print("Factor of " + num + " are ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
