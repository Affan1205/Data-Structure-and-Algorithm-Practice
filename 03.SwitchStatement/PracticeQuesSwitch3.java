//Input "gold", "silver", "bronze" and print medal points using switch on String.

import java.util.Scanner;

public class PracticeQuesSwitch3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which medel you got in your Run Race: ");
        String str = input.next();
        switch (str) {
            case "Gold":
                System.out.println("you won Rs 10,000");
                break;
            case "Silver":
                System.out.println("you won Rs 5,000");
                break;
            case "Bronze":
                System.out.println("you won Rs 2,000");
                break;

            default:
                System.out.println("Thankyou for participation , Keep Working and Grinding");
                break;
        }
    }
}
