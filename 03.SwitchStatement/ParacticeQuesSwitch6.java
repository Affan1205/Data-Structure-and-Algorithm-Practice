// ATM mock: 1) Check balance 2) Deposit 3) Withdraw 4) Exit; validate negative inputs via default.
import java.util.Scanner;

public class ParacticeQuesSwitch6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the starting amount: ");
        double balance = input.nextDouble();
        while (true) {
            System.out.println("Atm Menu: ");
            System.out.println("1) Check balance : ");
            System.out.println("2) Deposit : ");
            System.out.println("3) Withdraw : ");
            System.out.println("4) exit : ");
            System.out.println("choose option (1-4): ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("current balance " + balance);
                    break;
                case 2:
                    System.out.println("enter the amount to deposit");
                    double depositAmount = input.nextDouble();
                    if (depositAmount <= 0) {
                        System.out.println("Invalid amount.Must be positive!! ");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposited Amount : " + depositAmount + " New Balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawnAmount = input.nextDouble();
                    if (withdrawnAmount <= 0) {
                        System.out.println("Invalid amount.Must be positive!! ");
                    } else if (withdrawnAmount > balance) {
                        System.out.println("Insufficient  funds");
                    } else {
                        balance -= withdrawnAmount;
                        System.out.println("Withdrawn: " + withdrawnAmount + "New balance:  " + balance);
                    }
                    break;
                case 4:
                    System.out.println("Goodbye.");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid option. Choose 1-4.");
            }

        }

    }

}
