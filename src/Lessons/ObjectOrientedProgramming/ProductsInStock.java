package Lessons.ObjectOrientedProgramming;

import Lessons.ObjectOrientedProgramming.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductsInStock {
    void main(){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        int quantity;

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

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
