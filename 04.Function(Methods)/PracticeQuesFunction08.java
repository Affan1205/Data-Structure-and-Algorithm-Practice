//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that 
// will display grades according to the marks entered as below:

import java.util.Scanner;

public class PracticeQuesFunction08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your marks: ");
        int marks = input.nextInt();
        grades(marks);
    }

    static void grades(int marks) {
        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        } else if (marks >= 51 && marks <= 40) {
            System.out.println("BC");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail.");
        }
    }
}
