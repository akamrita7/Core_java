package designPattern.creational.factory;

public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Prepare PepperoniPizza pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake PepperoniPizza pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut PepperoniPizza pizza");
    }

    @Override
    public void box() {
        System.out.println("Box PepperoniPizza pizza");
    }
}
