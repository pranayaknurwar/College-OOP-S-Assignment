package Polymorphism.Bank_Example;

class Bank {
    double getInterestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.2;
    }
}

class ICICI extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank bank;

        bank = new SBI();
        System.out.println("SBI Interest: " + bank.getInterestRate());

        bank = new HDFC();
        System.out.println("HDFC Interest: " + bank.getInterestRate());

        bank = new ICICI();
        System.out.println("ICICI Interest: " + bank.getInterestRate());
    }
}

