package Exercises.SequentialStructureExercises;

import java.util.Scanner;

public class Ex003 {
    void main(){
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.printf("SUM = %d\n", sum);

        sc.close();

    }
}
