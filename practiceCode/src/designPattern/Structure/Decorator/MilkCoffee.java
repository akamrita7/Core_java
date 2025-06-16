package designPattern.Structure.Decorator;

public class MilkCoffee extends CoffeeDecorator{
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }
    public String getDescrition() {
        return coffee.getDescrition() + " added Milk";
    }

    public Double getCost() {
        return coffee.getCost() + 1.2;
    }
}
