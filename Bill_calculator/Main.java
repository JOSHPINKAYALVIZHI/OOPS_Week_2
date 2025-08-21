public class Main {
    public static void main(String[] args) {
        
        Product p1 = new Product(); 
        Product p2 = new Product("Soap", 25);
        Product p3 = new Product("Shampoo", 120);

       
        p1.display();
        p2.display();
        p3.display();

        
        Product.showTotalBill();
    }
}

class Product {
    String name;
    double price;
    static double totalBill = 0; 

    Product() {
        this("Unknown Item", 0); 
    }

    
    Product(String name, double price) {
        this.name = name;   
        this.price = price;
        totalBill += price; 
    }

    void display() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }

    static void showTotalBill() {
        System.out.println("Total Bill: $" + totalBill);
    }
}
