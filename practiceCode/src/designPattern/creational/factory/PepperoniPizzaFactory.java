package designPattern.creational.factory;

public class PepperoniPizzaFactory implements PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}
