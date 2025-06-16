package designPattern.creational.AbstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sit in Victorian Chair ");
    }
}
