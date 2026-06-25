package Lessons.ConditionalStructure;

import java.util.Scanner;

public class SwitchCase {
    void main() {
        // the switch statement is an alternative control structure to chained
        // if, else if, else statements.
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the number (1 - 7): ");
        number = sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default: // default value
                System.out.println("Invalid day");
                break;
        }

        sc.close();
    }
}
