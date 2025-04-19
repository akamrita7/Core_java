package designPattern.behavioral.TemplateDesignPattern;

abstract public class PhoneOrderTemplate {
    final void createOrder(){
        selectProduct();
        packProduct();
        makePayment();
        deliverProduct();
    }

    public  void packProduct(){
        System.out.println("paking the product");
    }

    public abstract void selectProduct() ;
    public abstract void makePayment() ;
    public abstract void deliverProduct() ;
}
