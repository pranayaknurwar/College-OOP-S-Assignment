package Interface;

interface PaymentGateway {
    void pay(double amount);
}

class UpiPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCardPayment implements PaymentGateway {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

public class PaymentService {
    public static void main(String[] args) {
        PaymentGateway payment = new UpiPayment();
        payment.pay(1500);
    }
}