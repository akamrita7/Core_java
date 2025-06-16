package designPattern.Structure.apadter2;

public class Iphone4sCharger implements Charger{
    @Override
    public void charge() {
        System.out.println("charging with 4s charger");
    }
}
