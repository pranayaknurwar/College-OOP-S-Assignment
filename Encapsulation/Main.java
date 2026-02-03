class ATMAccount {
    // private data members (hidden)
    private String accountNumber;
    private int pin;
    private double balance;

    // constructor
    public ATMAccount(String accNo, int pin, double balance) {
        this.accountNumber = accNo;
        this.pin = pin;
        this.balance = balance;
    }
    public String getAccountNumber() {
    return accountNumber;
}


    // validate PIN (internal logic)
    private boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // public method to check balance
    public double checkBalance(int enteredPin) {
        if (validatePin(enteredPin)) {
            return balance;
        }
        System.out.println("Invalid PIN!");
        return 0;
    }

    // public method to deposit money
    public void deposit(int enteredPin, double amount) {
        if (validatePin(enteredPin) && amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful!");
        } else {
            System.out.println("Transaction Failed!");
        }
    }

    // public method to withdraw money
    public void withdraw(int enteredPin, double amount) {
        if (validatePin(enteredPin) && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Invalid PIN or Insufficient Balance!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ATMAccount user = new ATMAccount("AC12345", 1234, 10000);

        user.deposit(1234, 2000);
        user.withdraw(1234, 3000);

        System.out.println("Current Balance: " + user.checkBalance(1234));
    }
}
