import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name + " | Price: ₹" + price);
    }
}


class GroceryProduct extends Product {
    String category;

    GroceryProduct(String name, double price, String category) {
        super(name, price);  
        this.category = category;
    }

    @Override
    void display() {
        System.out.println("Product: " + name + " | Category: " + category + " | Price: ₹" + price);
    }
}

class DiscountedProduct extends GroceryProduct {
    double discount;

    DiscountedProduct(String name, double price, String category, double discount) {
        super(name, price, category);  
        this.discount = discount;
    }

    @Override
    void display() {
        double finalPrice = price - (price * discount / 100);
        System.out.println("Product: " + name + " | Category: " + category +
                           " | Price: ₹" + price + " | Discount: " + discount + "%" +
                           " | Final Price: ₹" + finalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        sc.nextLine(); // consume newline
        System.out.print("Enter product category: ");
        String category = sc.nextLine();

        System.out.print("Enter discount (%): ");
        double discount = sc.nextDouble();

        // Multilevel inheritance object
        DiscountedProduct dp = new DiscountedProduct(name, price, category, discount);

        System.out.println("\n--- Bill Details ---");
        dp.display();

        sc.close();
    }
}
