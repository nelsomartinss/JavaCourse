package Lessons.LoopStructure;

import java.util.Scanner;

public class LoopForStructure {
    void main(){
        int number, integerNumbers, sumNumbers = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        number = sc.nextInt(); // quantity

        for (int i = 0; i < number; i++){
            System.out.print("Enter integer: ");
            integerNumbers = sc.nextInt();
            sumNumbers += integerNumbers;
        }

        System.out.printf("Sum of integers: %d", sumNumbers);
        sc.close();
    }
}
