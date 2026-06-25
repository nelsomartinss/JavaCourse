package Lessons.ObjectOrientedProgramming.Entities;

public class Triangle { // triangle entity
    public double a;
    public double b;
    public double c; // class attributes

    // public - indicates that the function can be used in another file
    // double - return type of the function
    // area - function/method name
    public double area(){ // it is not necessary to pass parameters, area is already an instance method that has access to the class attributes
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
