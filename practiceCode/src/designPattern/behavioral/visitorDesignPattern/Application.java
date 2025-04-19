package designPattern.behavioral.visitorDesignPattern;

public class Application {
    public static void main(String[] args) {
        ShoppingCartElement[] items = new ShoppingCartElement[]{
                new Item("Pen", 2.5),
                new Book("Java Design Patterns", 60.0),
                new Fruits("Apple", 1.5, 2.0)
        };
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();
        double cost = 0;
        for (ShoppingCartElement item : items){
            cost+=item.accept(shoppingCartVisitor);
        }
        System.out.println("Total cost: $" + cost);


    }
}
