package designPattern.behavioral.visitorDesignPattern;
//https://medium.com/@rajeshvelmani/extending-object-behavior-with-the-visitor-design-pattern-in-java-31bcbbcc6398
public class ShoppingCartVisitorImpl implements ShoppingCartVisitor{
    @Override
    public double visit(Item item) {
        return item.getPrice();
    }

    @Override
    public double visit(Book book) {
        double cost = book.getPrice();
        if (book.getPrice() > 50) {
            cost -= 5; // Apply discount for expensive books
        }
        return cost;
    }

    @Override
    public double visit(Fruits fruit) {
        return fruit.getPrice()*fruit.getWeight();
    }
}
