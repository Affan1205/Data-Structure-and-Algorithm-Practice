
//Reverse of number
import java.util.Scanner;

public class LectureQues4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number.");
        int num = input.nextInt();
        System.out.println("reverse of " + num + " is : ");
        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        System.out.println(ans);
    }
}
