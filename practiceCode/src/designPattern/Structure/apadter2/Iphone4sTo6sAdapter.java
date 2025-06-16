package designPattern.Structure.apadter2;

public class Iphone4sTo6sAdapter implements Charger{

    Iphone4sCharger iphone4sCharger = new Iphone4sCharger();
    @Override
    public void charge() {
        iphone4sCharger.charge();
    }
}
