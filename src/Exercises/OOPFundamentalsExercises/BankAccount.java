package Exercises.OOPFundamentalsExercises;

import Exercises.OOPFundamentalsExercises.Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        int number;
        String holder;
        double initialDeposit;
        char response;

        System.out.print("\nEnter account number: ");
        number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? : ");
        response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y'){
            System.out.print("Enter the initial deposit value: ");
            initialDeposit = sc.nextDouble();
            // Overloading (constructor with three arguments)
            account = new Account(number, holder, initialDeposit);
        } else {
            // Constructor with two arguments
            account = new Account(number, holder);
        }

        System.out.print("\nAccount data: ");
        System.out.println(account);

        // deposit
        System.out.print("\nEnter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.print("\nUpdated account data:");
        System.out.println(account);

        // withdraw
        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.print("\nUpdated account data: ");
        System.out.println(account);

        sc.close();
    }
}
