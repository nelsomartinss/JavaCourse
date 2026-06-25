package Lessons.LoopStructure;

import java.util.Scanner;

public class DebugIntellij {
    void main(){
        double width, length, squareMeter, area, priceLand;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter width: ");
        width = sc.nextDouble();
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter square meter: ");
        squareMeter = sc.nextDouble();

        area = width * length;
        priceLand = area * squareMeter;

        System.out.printf("\nArea: %.2f\n", area);
        System.out.printf("Price of the land: %.2f\n", priceLand);

        sc.close();
    }
}
