package Interface;

interface PaymentProcessor {
    void processPayment(double amount);
}

class Order {
    protected String orderId;
    protected double amount;

    public Order(String orderId, double amount) {
        this.orderId = orderId;  
        this.amount = amount;
    }

    public void placeOrder() {
        System.out.println("Order placed with ID: " + orderId);
    }
}

class PremiumOrder extends Order implements PaymentProcessor {
    private double discount;

    public PremiumOrder(String orderId, double amount, double discount) {
        super(orderId, amount);   
        this.discount = discount;
    }

    @Override
    public void placeOrder() {
        super.placeOrder();   
        System.out.println("Premium order benefits applied");
    }

    @Override
    public void processPayment(double amount) {
        double finalAmount = amount - this.discount; 
        System.out.println("Payment processed: ₹" + finalAmount);
    }
}

public class EcommerceApp {
    public static void main(String[] args) {

        PaymentProcessor order =
                new PremiumOrder("ORD101", 5000, 500);

        order.processPayment(5000);

        Order baseOrder = (Order) order;
        baseOrder.placeOrder();
    }
}
