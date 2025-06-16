package designPattern.Structure.Decorator;

public class SugarCoffeeDecorator extends CoffeeDecorator{
    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescrition() {
        return coffee.getDescrition() + " Added Sugar";
    }

    public Double getCost() {
        return coffee.getCost() + 0.5;
    }
}
