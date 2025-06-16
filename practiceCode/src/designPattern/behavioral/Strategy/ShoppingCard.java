package designPattern.behavioral.Strategy;

public class ShoppingCard {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        ShoppingCard cart = new ShoppingCard();
        cart.setPaymentStrategy(new CreditCardPayment("100896", "Akanshi"));
        cart.checkout(1000);
        cart.setPaymentStrategy(new Paypal("Avani","Avani@gmail.com"));
        cart.checkout(1000);
    }
}
