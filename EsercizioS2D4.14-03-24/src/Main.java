import entities.Customer;
import entities.Order;
import entities.Product;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;
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

        Product boys1 = new Product(7L, "Boy1", "Boys", 310.0);
        productList.add(boys1);

        Product boys2 = new Product(8L, "Boy2", "Boys", 320.0);
        productList.add(boys2);

        Product boys3 = new Product(9L, "Boy3", "Boys", 330.0);
        productList.add(boys3);

        Customer customer1 = new Customer(1L, "Mario", 1);

        Customer customer2 = new Customer(2L, "Chris", 1);

        Customer customer3 = new Customer(3L, "Maison", 2);

        Customer customer4 = new Customer(4L, "Filippo", 2);

        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(1L, "Paid", LocalDate.now(), LocalDate.now().plusDays(1), customer1, List.of(baby1, baby3)));

        orderList.add(new Order(2L, "Shipped", LocalDate.now(), LocalDate.now().plusDays(5), customer2, List.of(book1,book2)));

        orderList.add(new Order(3L, "Processed", LocalDate.parse("2021-03-03"), LocalDate.now().plusDays(5), customer3, List.of(boys1,boys2)));

        orderList.add(new Order(4L, "Processed", LocalDate.parse("2021-03-03"), LocalDate.now().plusDays(5), customer4, List.of(book1,boys2)));

        System.out.println();
        System.out.println("ESERCIZIO1");
        //ESERCIZIO1

        Map<Customer, List<Order>> ordersByCustomer = orderList.stream().collect(Collectors.groupingBy(order -> order.getCustomer()));
        ordersByCustomer.forEach((customer, orders) -> {
            System.out.println("Cliente: " + customer.getName());
            System.out.println("Ordini:");
            orders.forEach(order -> System.out.println(order.getProducts()));
        });

        System.out.println();
        System.out.println("ESERCIZIO2");
        //ESERCIZIO2
        Map<Customer, Double> customerOrderPriceSum = orderList.stream().collect(Collectors.toMap(order -> order.getCustomer(),
                order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum()));

        customerOrderPriceSum.forEach((customer, totalSales) -> {
            System.out.println("Cliente: " + customer.getName());
            System.out.println("Totale delle vendite: " + totalSales);
        });

        System.out.println();
        System.out.println("ESERCIZIO3");
        //ESERCIZIO3
        List<Product> productsSortedByPrice = productList.stream().sorted(Comparator.comparingDouble(product -> product.getPrice())).toList();

        productsSortedByPrice.forEach(System.out::println);

        System.out.println();
        System.out.println("ESERCIZIO4");
        //ESERCIZIO4
        OptionalDouble averageOrderPrice = orderList.stream().mapToDouble(order -> order.getProducts().stream().mapToDouble(product -> product.getPrice()).sum()).average();
        System.out.println(averageOrderPrice);

        System.out.println();
        System.out.println("ESERCIZIO5");
        //ESERCIZIO5
        Map<String, Double> productByCategoryPlusSum = productList.stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));
        System.out.println(productByCategoryPlusSum);
    }
}