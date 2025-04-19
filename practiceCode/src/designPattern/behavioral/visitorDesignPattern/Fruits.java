package designPattern.behavioral.visitorDesignPattern;

public class Fruits implements ShoppingCartElement{
    private String name;
    private double price;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public Fruits(String name, double price , double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
