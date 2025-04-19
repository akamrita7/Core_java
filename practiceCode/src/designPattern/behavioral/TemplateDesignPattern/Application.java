package designPattern.behavioral.TemplateDesignPattern;
//https://medium.com/@akshatsharma0610/template-design-pattern-in-java-453da50185a8
public class Application {
    public static void main(String[] args) {
        PhoneOrderTemplate offlineStore = new OfflineStore();
        offlineStore.createOrder();

        PhoneOrderTemplate onlineStore = new OnlineStore();
        onlineStore.createOrder();
    }
}
