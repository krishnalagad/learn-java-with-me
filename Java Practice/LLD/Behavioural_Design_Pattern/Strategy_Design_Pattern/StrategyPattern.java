package LLD.Behavioural_Design_Pattern.Strategy_Design_Pattern;

interface PaymentStrategy {
    void processPayment();
}

// Concrete strategy
class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via Credit Card..");
    }
}

// Concrete strategy
class DebitCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via Debit Card..");
    }
}

class UPI implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via UPI..");
    }
}

class PaymentService {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        this.strategy.processPayment();
    }
}
public class StrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CreditCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new DebitCard());
        paymentService.pay();

        paymentService.setPaymentStrategy(new UPI());
        paymentService.pay();
    }
}
