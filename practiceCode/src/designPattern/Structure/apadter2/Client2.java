package designPattern.Structure.apadter2;

public class Client2 {
    public static void main(String[] args) {
        IPhone iPhone6s = new IPhone6s(new Iphone4sTo6sAdapter());
        iPhone6s.OnCharge();
    }
}
