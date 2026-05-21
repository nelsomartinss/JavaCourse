package lessons;

public class DataProcessingAndCasting {
    void main(){
        int x, y, c, d;
        double z, a, b, B, h, result; // decimal numbers

        x = 5;
        y = 2 * x;
        z = 2 * x;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z); // converted to double type

        // Calculating the area of a trapezoid
        b = 6.0;
        B = 8.0;
        h = 5.0;

        a = (b + B) / 2 * h;
        System.out.printf("The area of trapezoid is %.0f\n", a);

        // Casting - Explicit converting
        // Preventing the compiler from removing the decimal places
        c = 5;
        d = 2;
        result = (double) c / d; // casting - explicit converting
        System.out.println(result);
    }
}
