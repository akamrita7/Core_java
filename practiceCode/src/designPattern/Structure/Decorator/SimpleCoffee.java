package designPattern.Structure.Decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescrition() {
        return "Simple Coffee";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
