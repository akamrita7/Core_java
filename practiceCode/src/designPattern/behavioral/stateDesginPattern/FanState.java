package designPattern.behavioral.stateDesginPattern;
//https://medium.com/@rajeshvelmani/managing-object-behavior-with-the-state-design-pattern-in-java-c00072e694f9
//The state interface or abstract class defines the common methods that encapsulate the behavior associated with a specific state. It typically declares methods for performing operations based on the state.
public interface FanState {
    void handleState(Fan fan);
}
