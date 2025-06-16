package designPattern.Structure.Bridge;

public class Implementation {
    public static void main(String[] args) {
        BasicRemote remote = new BasicRemote(new Tv());
        remote.turnOff();
        remote.turnOn();
        remote.setVolumt(10);
        BasicRemote  radio = new BasicRemote(new Radio());
        radio.turnOff();
        radio.turnOn();
        radio.setVolumt(4);
    }
}
