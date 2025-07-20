package java17.util;

public class Product {
    public Product(String name, int quantity, int inStockQuantity) {
        this.name = name;
        this.quantity = quantity;
        this.inStockQuantity = inStockQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", inStockQuantity=" + inStockQuantity +
                '}';
    }

    public Product() {

    }

    private String name;
    private int quantity;

    public int getInStockQuantity() {
        return inStockQuantity;
    }

    public void setInStockQuantity(int inStockQuantity) {
        this.inStockQuantity = inStockQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int inStockQuantity;
}
