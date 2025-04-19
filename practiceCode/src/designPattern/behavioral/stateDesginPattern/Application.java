package designPattern.behavioral.stateDesginPattern;

public class Application {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.request();
        fan.request();
        fan.request();
        fan.request();
        fan.request();
        fan.request();
        fan.request();
    }
}
