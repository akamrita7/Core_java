package designPattern.creational.factory;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory margheritaPizzaFactory = new MargheritaPizzaFactory();
        Pizza margheritaPizza = margheritaPizzaFactory.createPizza();
        margheritaPizza.bake();

    }
}
