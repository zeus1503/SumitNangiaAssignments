package Day5assign.BankAccountQuestion;

public abstract class Account {

        double amount;
        int AccountNumber;
        String AccountName;

        public abstract void deposit(double depo);
        public abstract void withdraw(double with);

    }

