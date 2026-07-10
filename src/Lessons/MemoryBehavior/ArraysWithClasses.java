package Lessons.MemoryBehavior;

import Lessons.MemoryBehavior.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ArraysWithClasses {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfProduct;
        double productPrice, sum = 0.0, media;
        String productName;

        System.out.print("\nEnter the number of products you want to add: ");
        numberOfProduct = sc.nextInt();
        Product[] vectProduct = new Product[numberOfProduct];

        for(int i = 0; i < vectProduct.length; i++){
            System.out.print("Enter the product name: ");
            productName = sc.next();
            System.out.print("Enter the product price: ");
            productPrice = sc.nextDouble();
            vectProduct[i] = new Product(productName, productPrice);
        }

        for(int i = 0; i < vectProduct.length; i++){
            sum += vectProduct[i].getPrice();
        }

        media = sum /  vectProduct.length;
        System.out.printf("\nAverage price: %.2f", media);

        sc.close();
    }
}
