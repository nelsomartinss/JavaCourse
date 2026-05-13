package exercicios;

import java.util.Locale;

public class Ex001 {
    void main(){
        Locale localeBR = Locale.of("PT", "BR");
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("\nProducts:");
        System.out.printf("%s, witch price is $%.2f\n", product1, price1);
        System.out.printf("%s, witch price is $%.2f\n", product2, price2);

        System.out.printf("\nRecode: %d years old, code %d and gender: %s\n", age, code, gender);

        System.out.printf("\nMeasure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three decimal places): %.3f\n", measure);
        System.out.printf(localeBR, "BR decimal code: $%.3f\n", measure);
    }
}
