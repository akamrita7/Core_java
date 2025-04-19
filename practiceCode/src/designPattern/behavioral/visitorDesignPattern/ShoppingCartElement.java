package designPattern.behavioral.visitorDesignPattern;

public interface ShoppingCartElement {
    double accept(ShoppingCartVisitor visitor);
}
