package designPattern.behavioral.stateDesginPattern;

public class HighState implements FanState {
    @Override
    public void handleState(Fan fan) {
        System.out.println("Fan turned on high.");
        fan.setState(new OffState());
    }
}
