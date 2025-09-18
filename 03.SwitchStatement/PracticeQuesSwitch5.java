// Grade classifier: A/B/C → "Well done", D → "Pass", F → "Fail" using grouped cases and breaks

import java.util.Scanner;

public class PracticeQuesSwitch5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Final Semester Grade : ");
        char ch = input.next().trim().charAt(0);
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("welldone");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail, Try Again");

            default:
                System.out.println("Invalid Input!!");
                break;
        }
    }
}
