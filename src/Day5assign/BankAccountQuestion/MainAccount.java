package Day5assign.BankAccountQuestion;

import java.util.Scanner;

public class MainAccount {

    public static void main(String[] args) {

        System.out.println("Press 1 to create savings account");
        System.out.println("Press 2 to create current account");

        Scanner type = new Scanner(System.in);
        int input = type.nextInt();

        System.out.println("Enter account number your want to choose");
        int Num = type.nextInt();
        System.out.println("Enter First name of Account holder");
        String Name = type.next();
        System.out.println("Enter initial deposit for your account. Minimum amount is 5000 for Saving and 10000 for Current");
        double iniBal = type.nextDouble();

        if (input == 1) {

            SavingAccount sa = new SavingAccount(Num, Name, iniBal);
            System.out.println("\nEnter D to deposit or W to withdraw");
            String input2 = type.next();

            if (input2.equals("D")) {
                System.out.println("\nEnter amount you want to deposit");
                double amt = type.nextDouble();
                sa.deposit(amt);
            }
            else if (input2.equals("W")) {
                System.out.println("\nEnter amount you want to withdraw");
                double amt = type.nextDouble();
                sa.withdraw(amt);
            }

            else {
                System.out.println("Invalid Input");
            }
        }
        if (input == 2) {

            CurrentAccount ca = new CurrentAccount(Num, Name, iniBal);
            System.out.println("\nEnter D to deposit or W to withdraw");
            String input3 = type.next();

            if (input3.equals("D")) {
                System.out.println("\nEnter the amount you want to deposit");
                double amt = type.nextDouble();
                ca.deposit(amt);

            }
            else if (input3.equals("W")) {
                System.out.println("\nEnter amount you want to withdraw");
                double amt = type.nextDouble();
                ca.withdraw(amt);
            }

            else {
                System.out.println("Invalid Input");
            }

        }

        if (input != 1 && input !=2){
            System.out.println("Invalid Account Choice");
            System.out.println("Either Choose Current or Savings Account");
        }

    }



    }
