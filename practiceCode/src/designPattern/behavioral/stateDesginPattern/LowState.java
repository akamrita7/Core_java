package designPattern.behavioral.stateDesginPattern;

public class LowState implements FanState {
    @Override
    public void handleState(Fan fan) {
        System.out.println("Fan turned on low.");
        fan.setState(new MediumState());
    }
}
