import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        Product book1 = new Product(1L, "BookA", "Books", 110.0);
        productList.add(book1);

        Product book2 = new Product(2L, "BookB", "Books", 120.0);
        productList.add(book2);

        Product book3 = new Product(3L, "BookC", "Books", 90.0);
        productList.add(book3);

        Product baby1 = new Product(4L, "Baby1", "Baby", 210.0);
        productList.add(baby1);

        Product baby2 = new Product(5L, "Baby2", "Baby", 220.0);
        productList.add(baby2);

        Product baby3 = new Product(6L, "Baby3", "Baby", 230.0);
        productList.add(baby3);

        //ESERCIZIO1

        List<Product> filteredBooksList = productList.stream().filter(product -> "Books".equals(product.getCategory()) && product.getPrice() > 100).toList();

        System.out.println("LISTA PRODOTTI FILTRATA: " + filteredBooksList);

        //ESERCIZIO 2

        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(2L, "Paid", LocalDate.now(), LocalDate.now().plusDays(1), new Customer(1L, "Mario", 1),
                List.of(baby1, baby3)));

        orderList.add(new Order(1L, "Shipped", LocalDate.now(), LocalDate.now().plusDays(5), new Customer(2L, "Chris", 2),
                List.of(book1,book2)));

        List<Order> filteredOrders = orderList.stream().filter(order -> order.getProducts().stream().anyMatch(product -> "Baby".equals(product.getCategory()))).toList();

        System.out.println("LISTA ORDINI FILTRATA: " + filteredOrders);
    }
}
