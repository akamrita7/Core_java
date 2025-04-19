package designPattern.behavioral.TemplateDesignPattern;

public class OnlineStore extends PhoneOrderTemplate{
    @Override
    public void selectProduct() {
        System.out.println("selecting the product in online store");
    }

    @Override
    public void makePayment() {
        System.out.println("making the payment in online store");
    }

    @Override
    public void deliverProduct() {
        System.out.println("product delivered at home of the client");
    }
}
