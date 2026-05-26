package Exercises.SequentialStructureExercises;

import java.util.Locale;
import java.util.Scanner;

public class Ex007 {
    void main(){
        int part1Id, numbersOfPart1;
        int part2Id, numbersOfPart2;
        double unitValuePart1, unitValuePart2, total;

        Locale localeBR = Locale.of("PT", "BR");
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Part 1's ID: ");
        part1Id = sc.nextInt();
        System.out.print("Enter numbers of part 1's: ");
        numbersOfPart1 = sc.nextInt();
        System.out.print("Enter the unit value of each part 1's: ");
        unitValuePart1 = sc.nextDouble();

        System.out.printf("%d, %d, %.2f\n ", part1Id, numbersOfPart1, unitValuePart1);

        System.out.print("\nEnter Part 2's ID: ");
        part2Id = sc.nextInt();
        System.out.print("Enter numbers of part 2's: ");
        numbersOfPart2 = sc.nextInt();
        System.out.print("Enter the unit value of each part 2's: ");
        unitValuePart2 = sc.nextDouble();

        System.out.printf("%d, %d, %.2f\n ", part2Id, numbersOfPart2, unitValuePart2);


        total = ((double) numbersOfPart1 * unitValuePart1) + ((double) numbersOfPart2 * unitValuePart2);
        System.out.printf(localeBR, "\nTotal is R$%.2f\n", total);
    }
}
