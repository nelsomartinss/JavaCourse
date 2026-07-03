package Exercises.OOPFundamentalsExercises;

import Exercises.OOPFundamentalsExercises.Entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;
        int accountNumber;
        String accountHolder;
        double deposit;
        char option;

        System.out.print("\nEnter account number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? : ");
        option = sc.next().charAt(0);

        if (option == 'y' || option == 'Y'){
            System.out.print("Enter the initial deposit value: ");
            deposit = sc.nextDouble();
            // Constructor
            account = new Account(accountNumber, accountHolder, deposit);
        } else {
            // Overloading
            account = new Account(accountNumber, accountHolder);
        }

        System.out.print("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        account.addDeposit(sc.nextDouble());
        System.out.print("\nUpdated account data:");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.print("\nUpdated account data: ");
        System.out.println(account);
    }
}
