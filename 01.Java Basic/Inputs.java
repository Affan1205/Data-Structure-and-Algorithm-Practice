import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);

        // String Inputs
        // String name = input.next();//print the string untill it finds space
        // String name = input.nextLine();//print complete the strings
        // System.out.println(name);

        // float marks = input.nextFloat();
        // System.out.println(marks);
    }
}
