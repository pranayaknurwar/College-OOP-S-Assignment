package Abstract_Classes;

abstract class BankAccount {
    abstract double calculateInterest();

    void accountType() {
        System.out.println("Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double balance = 10000;

    double calculateInterest() {
        return balance * 0.04;
    }
}

public class sample02 {
    public static void main(String[] args) {
        BankAccount acc = new SavingsAccount();
        acc.accountType();
        System.out.println("Interest: " + acc.calculateInterest());
    }
}