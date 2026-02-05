package Abstract_Classes;

abstract class Payment {
    abstract void pay(double amount);

    void paymentInfo() {
        System.out.println("Secure payment processing");
    }
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UpiPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class sample05 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();

        p1.pay(5000);
        p2.pay(2000);
    }
}
