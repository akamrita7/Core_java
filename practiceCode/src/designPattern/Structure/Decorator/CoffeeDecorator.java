package designPattern.Structure.Decorator;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    public String getDescrition() {
        return "Decorator " +coffee.getDescrition();
    }

    public Double getCost() {
        return  coffee.getCost();
    }
}
