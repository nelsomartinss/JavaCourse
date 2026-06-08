package Lessons.LoopStructure;

import java.util.Scanner;

public class LoopDoWhileStructure {
    void main(){
        double c, f;
        char repeat;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the temperature in Celsius: ");
            c = sc.nextDouble();

            f = (c * 1.8) + 32;

            System.out.printf("Equivalent in Fahrenheit is %.1f degrees\n", f);

            System.out.print("would you like to repeat? (s/n) ");
            repeat = sc.next().charAt(0);

        } while (repeat != 'n');

        sc.close();
    }
}
