package designPattern.Structure.Bridge;

public class Radio implements Device{
    @Override
    public void turnOn() {
        System.out.println("Radi On");
    }

    @Override
    public void turnOff() {
        System.out.println("Radi Off");
    }

    @Override
    public void setVolumt(int value) {
        System.out.println(" Radio Volume  set " + value);
    }
}
