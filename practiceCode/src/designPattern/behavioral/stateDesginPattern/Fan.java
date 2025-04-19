package designPattern.behavioral.stateDesginPattern;

//he context represents the object whose behavior changes based on its internal state. It maintains a reference to the current state object and delegates behavior to it.
public class Fan {
    private FanState currentState;

    public Fan() {
        this.currentState = new OffState();
    }

    public void setState(FanState currentState) {
        this.currentState = currentState;
    }

    public void request(){
        currentState.handleState(this);
    }
}
