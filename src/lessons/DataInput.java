package lessons;
import java.util.Locale;
import java.util.Scanner; // Importing the scanner object

public class DataInput {
    void main(){
        Locale localeBR = Locale.of("PT", "BR");
        Scanner sc = new Scanner(System.in); // creating scanner

        String name;
        char gender;
        int age;
        double balance;

        System.out.print("Enter your name: ");
        name = sc.next(); // DataInput

        System.out.print("Enter your gender: ");
        gender = sc.next().charAt(0); // Receiving a single character

        System.out.print("Enter your age: ");
        age = sc.nextInt(); // Receiving integer numbers

        System.out.print("Enter your balance: ");
        balance = sc.nextDouble(); // Receiving decimal numbers

        System.out.printf("\nYour name is %s\n", name);
        System.out.printf("Your gender is %s\n", gender);
        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your balance is %.2f\n", balance);

        // Locale Brazil
        System.out.printf(localeBR, "Your balance is %.2f\n", balance);

        sc.close(); // closing scanner
    }
}
