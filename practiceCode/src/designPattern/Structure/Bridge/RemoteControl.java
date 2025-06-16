package designPattern.Structure.Bridge;

public abstract class RemoteControl {

     Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    /*public void setDevice(Device device) {
        this.device = device;
    }*/
    public abstract void  turnOn();
    public abstract void turnOff();
    public abstract void setVolumt(int value);
}
