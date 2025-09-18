//Check Leap Year Or Not

import java.util.Scanner;

public class PracticeQuesConditional9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if ((year%4 ==0 && year%100 !=0 )||( year%400==0)) {
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year + " not a leap year.");
        }
    }
}
