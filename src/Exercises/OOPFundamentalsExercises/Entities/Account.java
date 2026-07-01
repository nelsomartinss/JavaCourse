package Exercises.OOPFundamentalsExercises.Entities;

public class Account {
    // Encapsulation
    private String accountNumber;
    private String accountHolder;
    private double deposit; // class attribute, java initializes a double to 0.0 automatically

    // Constructor
    public Account(String accountNumber, String accountHolder, double deposit){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.deposit = deposit;
    }

    // Overloading
    public Account(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // Methods
    // add
    public void addDeposit(double deposit){
        this.deposit += deposit;
    }
    // remove
    public void withdraw(double amount){
        this.deposit -= amount-5;
    }
    // custom toString
    public String toString(){
        return String.format(
                "\nAccount %s\nHolder: %s\nBalance: $%.2f",
                accountNumber, accountHolder, deposit
        );
    }

    // Setters
    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }
}
