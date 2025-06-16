package designPattern.Structure.proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("amrita");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        try {
            internet.connectTo("aku");
            internet.connectTo("abc");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
