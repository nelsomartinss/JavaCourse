package Exercises.ConditionalStructureExercises;

import java.util.Scanner;

@SuppressWarnings("ManualMinMaxCalculation") // block lint
public class Ex011 {
    void main(){
        int a, b, c, minor;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

       if (a < b && a < c){
           minor = a;
       } else if (b < c){
           minor = b;
       } else {
           minor = c;
       }

       System.out.printf("\nMinor = %d\n", minor);

        sc.close();
    }
}
