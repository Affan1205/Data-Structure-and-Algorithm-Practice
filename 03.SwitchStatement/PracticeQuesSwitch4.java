// Read operation "+", "-", "*", "/" as String and perform basic calculator using switch.
import java.util.Scanner;
public class PracticeQuesSwitch4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("choose operation b/w ( + , - ,  * ,  /) :  ");
        String str = input.next().trim();
        switch (str) {
            case "+":

                System.out.println(num1 + num2);
                break;
            case "-":

                System.out.println(num1 - num2);
                break;
            case "*":

                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0 || num2 < 0) {
                    System.out.println("Error: divide by zero");
                } else {
                    System.out.println(num1 / num2);
                }
                break;

            default:
                System.out.println("Invalid operation");
                break;
        }
    }
}
