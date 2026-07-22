package Exercises.MemoryBehaviorExercises;

import java.util.Locale;
import java.util.Scanner;

import Exercises.MemoryBehaviorExercises.Entities.People;

public class Ex007 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfPeople, peopleAge, sumAgeUnder16 = 0;
        String peopleName;
        double peopleHeight, sumHeight = 0.0, mediaHeight, percentageUnder16Years;

        System.out.print("\nHow many people do you want to add?: ");
        numberOfPeople = sc.nextInt();
        People[] vectPeople = new People[numberOfPeople];

        for(int i = 0; i < vectPeople.length; i++){
            System.out.printf("\nData for the %da person:\n", i + 1);

            System.out.print("Name: ");
            peopleName = sc.next();

            System.out.print("Age: ");
            peopleAge = sc.nextInt();

            System.out.print("Height: ");
            peopleHeight = sc.nextDouble();

            vectPeople[i] = new People(peopleName, peopleAge, peopleHeight);
        }

        for(int i = 0; i < vectPeople.length; i++){
            sumHeight += vectPeople[i].getHeight();
        }

        for(int i = 0; i < vectPeople.length; i++){
            if(vectPeople[i].getAge() < 16){
                sumAgeUnder16++;
            }
        }

        mediaHeight = sumHeight / numberOfPeople;
        percentageUnder16Years = (double) sumAgeUnder16 / vectPeople.length * 100;

        System.out.printf("\nAverage height: %.2f\n", mediaHeight);
        System.out.printf("People under 16 years old: %.2f\n", percentageUnder16Years);

        for(int i = 0; i < vectPeople.length; i++){
            if(vectPeople[i].getAge() < 16){
                System.out.println(vectPeople[i].getName());
            }
        }

        sc.close();
    }
}
