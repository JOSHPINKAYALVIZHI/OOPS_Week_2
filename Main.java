import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {  
            System.out.print("Enter number of products: ");
            int n = sc.nextInt();

            
            Product[] products = new Product[n];

            for (int i = 0; i < n; i++) {
                sc.nextLine(); 
                System.out.print("Enter product name: ");
                String name = sc.nextLine();

                System.out.print("Enter product price: ");
                double price = sc.nextDouble();

                products[i] = new Product(name, price);
            }

            System.out.println("\n--- Bill Details ---");
            for (Product p : products) {
                p.display();
            }

            Product.showTotalBill();
        }
    }
}

class Product {
    String name;
    double price;
    static double totalBill = 0; 

    // Default constructor
    Product() {
        this("Unknown Item", 0); 
    }

   
    Product(String name, double price) {
        this.name = name;   
        this.price = price;
        totalBill += price; 
    }

    
    void display() {
        System.out.println("Product: " + name + " | Price: ₹" + price);
    }

    // Show total bill
    static void showTotalBill() {
        System.out.println("\nTotal Bill: ₹" + totalBill);
    }
}
