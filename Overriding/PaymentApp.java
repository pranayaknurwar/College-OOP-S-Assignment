package Overriding;

class Payment {

    void processPayment() {
        System.out.println("Processing generic payment");
    }

}

class UpiPayment extends Payment {

    @Override
    void processPayment(){
        System.out.println("Processing UPI payment");
    }

}

class CardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing Card payment");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment;

        payment = new UpiPayment();
        payment.processPayment();
        

        payment = new CardPayment();
        payment.processPayment();
    }
}

