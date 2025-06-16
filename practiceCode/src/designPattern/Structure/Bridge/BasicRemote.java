package designPattern.Structure.Bridge;

public class BasicRemote extends RemoteControl{

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
       device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public void setVolumt(int value) {
        device.setVolumt(value);
    }
}
