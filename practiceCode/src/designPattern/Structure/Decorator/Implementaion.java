package designPattern.Structure.Decorator;

public class Implementaion {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescrition());
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescrition());
        System.out.println(coffee.getCost());
        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getDescrition());
        System.out.println(coffee.getCost());
    }
}
