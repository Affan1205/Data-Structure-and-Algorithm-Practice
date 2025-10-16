import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        // Method 1 -> O(n) complexity
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        boolean isPrime = true;
        if (num < 1) {
            System.out.println("Enter postive interger greater than 0.");
        }
        if (num == 1) {
            System.out.println("1 is not a prime number.");
        }
        if (num >= 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    //}}
    // -----------------------------------------------------------------------------//

    // Method 2 ->

    // O(root n) complexity
    Scanner input = new Scanner(System.in);System.out.println("Enter a number: ");
    int num = input.nextInt();
    boolean isPrime = true;if(num<=0)
    {
            System.out.println("Invlaid input..");
        }if(num>1)
    {
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }if(isPrime)
    {
        System.out.println(num + " is a Prime Number.");
    }else
    {
        System.out.println(num + " is not a Prime Number.");
    }
}}
