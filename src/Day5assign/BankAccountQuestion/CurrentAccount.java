package Day5assign.BankAccountQuestion;

import Day5assign.BankAccountQuestion.Account;

final public class CurrentAccount extends Account {

    double interest = 2.5;
    final double minBalance = 10000;

    public CurrentAccount(int a, String b, double c) {
        super.AccountNumber = a;
        super.AccountName = b;
        super.amount = c;
    }

    @Override
        public void deposit(double depo){
            amount = amount + depo;
            System.out.println("Deposit Successful");
            System.out.println("Balance after deposit is : " + amount);

        }
    @Override
        public void withdraw(double with){
        if (amount < minBalance) {
            System.out.println("Unable to withdraw. Amount is less than minimum balance required");
        } else {
            amount = amount - with;
            if(amount>0){
                System.out.println("Balance after withdrawal is : " + amount);}
            else{
                System.out.println("Requested Withdrawal is greater than account balance");}

        }

        }
    }
