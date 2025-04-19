package designPattern.behavioral.TemplateDesignPattern;

public class OfflineStore extends PhoneOrderTemplate{
    @Override
    public void selectProduct() {
        System.out.println("selecting the product in offline store");
    }

    @Override
    public void makePayment() {
        System.out.println("making the payment in offline store");
    }

    @Override
    public void deliverProduct() {
        System.out.println("product deliverd in hands in offline store");
    }
}
