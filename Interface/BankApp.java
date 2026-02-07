package Interface;

class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber; // this keyword
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

// Child class
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber); // calling parent constructor
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount); // reuse parent logic
        System.out.println("Savings account updated");
    }
}

// Main
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("SB101", 4.5);
        acc.deposit(5000);
    }
}