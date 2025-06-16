package designPattern.creational.factory;

public class MargheritaPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Prepare MargheritaPizza pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake MargheritaPizza pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut MargheritaPizza pizza");
    }

    @Override
    public void box() {
        System.out.println("Box MargheritaPizza pizza");
    }
}
