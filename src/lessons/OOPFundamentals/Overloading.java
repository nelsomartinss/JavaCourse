package lessons.OOPFundamentals;

import lessons.OOPFundamentals.Entities.ProductOverloading;

import java.util.Locale;
import java.util.Scanner;

public class Overloading {
    void main(){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int quantity;

        // Forcing the user to provide data before instantiation
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Price: ");
        price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();

        // Overloading -- Other constructor with different parameters
        ProductOverloading product = new ProductOverloading(name, price);
        // Default constructor instantiation
        ProductOverloading p = new ProductOverloading();

        System.out.printf(product.toString());

        System.out.print("\nEnter the number of products to be added in stock: ");
        quantity = sc.nextInt();

        product.addProducts(quantity);
        System.out.println("\nUpdated data: " + product);

        System.out.print("\nEnter the number of products to be removed in stock: ");
        quantity = sc.nextInt();

        product.removeProducts(quantity);
        System.out.println("\nUpdated data: " + product);

        sc.close();
    }
}
