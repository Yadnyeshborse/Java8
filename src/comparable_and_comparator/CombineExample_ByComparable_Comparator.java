package comparable_and_comparator;

import java.util.*;

// Product class with natural ordering by id
class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Natural ordering: by id
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + " " + name + " $" + price;
    }
}

public class CombineExample_ByComparable_Comparator {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(3, "Laptop", 1200.00));
        products.add(new Product(1, "Mouse", 25.50));
        products.add(new Product(2, "Keyboard", 45.00));

        // Natural sort using Comparable (by id)
        Collections.sort(products);
        System.out.println("Sorted by ID (Comparable):");
        products.forEach(System.out::println);

        // Sort by price using Comparator + lambda
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        System.out.println("\nSorted by Price (Comparator):");
        products.forEach(System.out::println);

        // Sort by name using Comparator.comparing (Java 8)
        products.sort(Comparator.comparing(p -> p.name));
        System.out.println("\nSorted by Name (Comparator.comparing):");
        products.forEach(System.out::println);
    }
}

