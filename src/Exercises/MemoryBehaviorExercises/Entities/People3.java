package Exercises.MemoryBehaviorExercises.Entities;

public class People3 {
    private double height;
    private char gender;

    public  People3(double height, char gender) {
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
}
