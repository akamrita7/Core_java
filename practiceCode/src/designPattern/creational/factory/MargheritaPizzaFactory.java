package designPattern.creational.factory;

public class MargheritaPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
