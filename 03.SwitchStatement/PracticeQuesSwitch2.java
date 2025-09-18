//Given a character for traffic light R/Y/G, print the action: Stop/Ready/Go using grouped cases.

import java.util.Scanner;

public class PracticeQuesSwitch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("choose the traffic light R/Y/G");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'R':
                System.out.println("stop at signal.");
                break;
            case 'Y':
                System.out.println("Ready to move.");
                break;
            case 'G':
                System.out.println("Go.");
                break;

            default:
                System.out.println("Wait!!");
                break;
        }
    }
}
