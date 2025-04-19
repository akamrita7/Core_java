package designPattern.behavioral.stateDesginPattern;

public class OffState implements FanState {
    @Override
    public void handleState(Fan fan) {
        System.out.println("Fan turned off.");
        fan.setState(new LowState());
    }
}
