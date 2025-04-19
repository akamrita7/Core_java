package designPattern.behavioral.visitorDesignPattern;

public interface ShoppingCartVisitor {
    double visit(Item item);
    double visit(Book book);
    double visit(Fruits fruit);
}
