package Overriding;

class Bank {
    double getInterestRate() {
        return 4.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5;
    }
}

public class BankApp {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
    }
}
