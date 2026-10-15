package designPattern.creational.factory;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory margheritaPizzaFactory = new MargheritaPizzaFactory();
        Pizza margheritaPizza = margheritaPizzaFactory.createPizza();
        margheritaPizza.bake();
        PizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniPizzaFactory.createPizza();
        pepperoniPizza.bake();


    }
}
