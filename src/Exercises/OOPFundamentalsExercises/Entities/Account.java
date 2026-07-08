package Exercises.OOPFundamentalsExercises.Entities;

public class Account {
    // Encapsulation
    private int number; // get
    private String holder; // set
    private double balance; // get

    // Constructor with two arguments
    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    // Overloading (constructor with three arguments)
    public Account(int number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); // using the method
    }

    // Since the attributes are private, we need to create getter and setter methods
    public int getNumber() {
        return number;
    }

    public int getHolder() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // add
    // encapsuling the business logic within the method
    public void deposit(double amount){
        balance += amount;
    }

    // remove
    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    // custom toString
    public String toString(){
        return String.format(
                "\nAccount %s\nHolder: %s\nBalance: $%.2f",
                number, holder, balance
        );
    }
}
