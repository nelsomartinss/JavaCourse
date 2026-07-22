package Exercises.MemoryBehaviorExercises;

import Exercises.MemoryBehaviorExercises.Entities.People3;

import java.util.Locale;
import java.util.Scanner;

public class Ex011 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numberOfPeople, numberOfWomen = 0, numberOfMen = 0;
        char gender;
        double height, minimumHeight, largestHeight, totalWomenHeight = 0.0, averageWomenHeight;

        System.out.print("\nHow many people do you want to add?: ");
        numberOfPeople = sc.nextInt();
        People3[] vectPeople = new People3[numberOfPeople];

        for(int i = 0; i < vectPeople.length; i++){
            System.out.printf("Height of the %dst person: ", i + 1);
            height = sc.nextDouble();
            System.out.printf("Gender of the %dst person: ", i + 1);
            gender = sc.next().charAt(0);

            vectPeople[i] = new People3(height, gender);
        }

        largestHeight = vectPeople[0].getHeight();
        minimumHeight = vectPeople[0].getHeight();

        for (People3 vectPerson : vectPeople) {
            if (vectPerson.getHeight() > largestHeight) {
                largestHeight = vectPerson.getHeight();
            }

            if (vectPerson.getHeight() < minimumHeight) {
                minimumHeight = vectPerson.getHeight();
            }
        }

        for (People3 vectPerson : vectPeople) {
            if (vectPerson.getGender() == 'F') {
                numberOfWomen++;
                totalWomenHeight += vectPerson.getHeight();
            } else {
                numberOfMen++;
            }
        }

        averageWomenHeight = totalWomenHeight / numberOfWomen;

        System.out.printf("\nMinimum height: %.2f\n", minimumHeight);
        System.out.printf("Largest height: %.2f\n", largestHeight);
        System.out.printf("Average height of the women: %.2f\n", averageWomenHeight);
        System.out.printf("Numbers of men: %d\n", numberOfMen);

        sc.close();
    }
}
