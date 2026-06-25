package Lessons.SequentialStructure;

public class MathematicalFunctions {
    void main(){
        double a, b, c, x, y, z;

        x = 2048;
        y = 7075;
        z = 12454;

        a = Math.sqrt(x); // Square root
        b = Math.pow(y, 2); // Power
        c = Math.abs(z); // Absolute value (remove the negative sign)

        System.out.printf("%.0f\n", a);
        System.out.printf("%.0f\n", b);
        System.out.printf("%.0f\n", c);
    }
}
