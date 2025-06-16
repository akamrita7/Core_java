package designPattern.Structure.Bridge;

public class Tv implements Device{
    @Override
    public void turnOn() {
        System.out.println("Tv On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Off");
    }

    @Override
    public void setVolumt(int value) {
        System.out.println("Tv Volume  set " + value);
    }
}
