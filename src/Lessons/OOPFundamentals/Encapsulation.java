package Lessons.OOPFundamentals;

import Lessons.OOPFundamentals.Entities.ProductEncapsulation;

import java.util.Locale;
import java.util.Scanner;

public class Encapsulation {
    void main(){
        Locale.setDefault(Locale.US);
        ProductEncapsulation product = new ProductEncapsulation();
        Scanner sc = new Scanner(System.in);

        // Forcing the user to provide data before instantiation
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.setName(sc.nextLine());
        System.out.print("Price: ");
        product.setPrice(sc.nextDouble());

        System.out.printf(product.toString());

        System.out.print("\nEnter the number of products to be added in stock: ");
        product.addProducts(sc.nextInt());
        System.out.println("\nUpdated data: " + product);

        System.out.print("Enter the number of products to be removed in stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("\nUpdated data: " + product);

        sc.close();
    }
}
