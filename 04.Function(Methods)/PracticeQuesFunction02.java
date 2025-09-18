//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
public class PracticeQuesFunction02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter an number: ");
        int num = input.nextInt();
        evenOdd(num);
    }

    static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }
}
