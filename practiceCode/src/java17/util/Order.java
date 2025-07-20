package java17.util;

import java.util.List;

public class Order {
    private double amount;
    private List<Product> products;

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", products=" + products +
                '}';
    }

    public Order(double amount, List<Product> products) {
        this.amount = amount;
        this.products = products;
    }
    public Order() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
