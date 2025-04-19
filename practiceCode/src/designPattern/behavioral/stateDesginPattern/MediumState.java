package designPattern.behavioral.stateDesginPattern;

public class MediumState implements FanState {
    @Override
    public void handleState(Fan fan) {
        System.out.println("Fan turned on medium.");
        fan.setState(new HighState());
    }
}
