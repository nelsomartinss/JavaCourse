package Lessons.LoopStructure;

import java.util.Scanner;

public class WhileStructure {
    void main(){
        int number, acucumulator = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        while (number != 0){ // the loop will continue as long as the number is not equal to 0.
            acucumulator += number;
            System.out.print("Enter a number: ");
            number = sc.nextInt();
        }

        System.out.print(acucumulator);
        sc.close();
    }
}
