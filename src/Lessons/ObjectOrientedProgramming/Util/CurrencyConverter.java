package Lessons.ObjectOrientedProgramming.Util;

public class CurrencyConverter {

    // Constant
    private static final double IOF_RATE = 0.06;

    // Static method
    public static double totalAmount(double amountToBuy, double dollarExchangeRate) {
        double amount = amountToBuy * dollarExchangeRate;
        return amount + amount * IOF_RATE; // using constant
    }
}
