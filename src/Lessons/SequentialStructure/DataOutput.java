package Lessons.SequentialStructure;

public class DataOutput {
    // Basic structure of a Java 25 code
     void main(){
        int number = 12;
        int age = 25;
        double wage = 1236.122412;
        String name = "Nelson";

        System.out.println("Hello World!");
        System.out.println("Good Morning");
        System.out.println(number); // displaying variable content
        System.out.printf("%.4f%n", wage); // displaying formatted value with 0 decimal places
        System.out.println("My name is " + name); // concatenation
        System.out.printf("My salary is R$%.2f%n", wage);
        System.out.printf("%s is %d years old and earns R$%.2f", name, age, wage);
    }
}
