package Exercises.MemoryBehaviorExercises;

import Exercises.MemoryBehaviorExercises.Entities.People2;

import java.util.Locale;
import java.util.Scanner;

public class Ex009 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfPeople, peopleAge;
        String peopleName;

        System.out.print("\nHow many people do you want to add?: ");
        numberOfPeople = sc.nextInt();
        People2[] vectPeople = new People2[numberOfPeople];

        for(int i = 0; i < vectPeople.length; i++){
            System.out.printf("\nData for the %da person:\n", i + 1);
            System.out.print("Name: ");
            peopleName = sc.next();
            System.out.print("Age: ");
            peopleAge = sc.nextInt();

            vectPeople[i] = new People2(peopleName, peopleAge);
        }

        int oldestAge = vectPeople[0].getAge();

        String oldestPeople = null;
        for (People2 vectPerson : vectPeople) {
            if (vectPerson.getAge() > oldestAge) {
                oldestAge = vectPerson.getAge();
                oldestPeople = vectPerson.getName();
            }
        }

        System.out.println("\nOldest people: " + oldestPeople);

        sc.close();
    }
}
