package java17.util;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Write a stream to filter order with amount Great than 500 and filter product out of order and sort product by quantity asc. Order contains product amount and product conain instock quantity
/*Filter orders where amount > 500
From those orders, extract products
Filter products that are in stock (inStockQuantity > 0)
Sort the products by quantity (ascending)*/
public class ProductOrderProcess {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(600, List.of(
                        new Product("Laptop", 2, 5),
                        new Product("Mouse", 10, 0)
                )),
                new Order(400, List.of(
                        new Product("Keyboard", 3, 8),
                        new Product("Monitor", 1, 4)
                )),
                new Order(750, List.of(
                        new Product("Phone", 5, 10),
                        new Product("Charger", 6, 0),
                        new Product("Headset", 1, 7)
                ))
        );
        List<Product> filteredSortedProducts = orders.stream()
                .filter(order -> order.getAmount() > 500) // Filter orders with amount > 500
                .flatMap(order -> order.getProducts().stream()) // Extract all products from filtered orders
                .filter(product -> product.getInStockQuantity() > 0) // Only include products that are in stock
                .sorted(Comparator.comparingInt(Product::getQuantity)) // Sort products by quantity (ascending)
                .toList();
        filteredSortedProducts.forEach(System.out::println);
    }
}
