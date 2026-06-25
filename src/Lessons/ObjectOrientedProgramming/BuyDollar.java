package Lessons.ObjectOrientedProgramming;

import java.util.Locale;
import java.util.Scanner;

import Lessons.ObjectOrientedProgramming.Util.CurrencyConverter;

public class BuyDollar {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double dollarExchangeRate, amountToBuy, totalAmount;

        System.out.println("What is the dollar price?");
        dollarExchangeRate = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        amountToBuy = sc.nextDouble();

        totalAmount = CurrencyConverter.totalAmount(dollarExchangeRate, amountToBuy);

        System.out.printf("\nTotal amount to buy: %.2f\n", totalAmount);

        sc.close();
    }
}
