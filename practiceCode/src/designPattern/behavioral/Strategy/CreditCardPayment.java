package designPattern.behavioral.Strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String creditcardNumber;
    private String cardHolderName;
    public CreditCardPayment(String creditcardNumber, String cardHolderName) {
        this.creditcardNumber = creditcardNumber;
        this.cardHolderName = cardHolderName;
    }


    @Override
    public void pay(int amount) {
        if(amount < 9000) {
            System.out.println("Payment " + amount + "Done by card " + creditcardNumber);
        }else {
            System.out.println("insufficent amount ");
        }
    }
}
