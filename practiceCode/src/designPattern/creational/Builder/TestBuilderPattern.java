package designPattern.creational.Builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        CarBuilder car = new CarBuilder.Builder("","").year(120925).build();
    }
}
