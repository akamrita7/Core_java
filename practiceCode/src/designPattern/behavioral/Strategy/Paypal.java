package designPattern.behavioral.Strategy;

public class Paypal implements PaymentStrategy{
    private String name;
    private String email;

    public Paypal(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        if(email.substring(0,email.indexOf('@')).equalsIgnoreCase(name)) {
            System.out.println("Payment " + amount + "Done by paypal " + name);
        }else{
            System.out.println("Payment fail");
        }
    }
}
