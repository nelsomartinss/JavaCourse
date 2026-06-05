package exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex005 {
    void main(){
        int fuelType, accAlcohol = 0, accGas = 0, accDiesel = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                \nEnter the number of the fuel type you prefer:
                1 - Alcohol
                2 - Gasoline
                3 - Diesel
                4 - End
                """);

        while (true){
            fuelType = sc.nextInt();

            if (fuelType == 1){
                accAlcohol+=1;
            } else if (fuelType == 2){
                accGas+=1;
            } else if (fuelType == 3){
                accDiesel+=1;
            } else if (fuelType == 4){
                break;
            }
        }

        System.out.println("\nTHANK YOU VERY MUCH");
        System.out.printf("Alcohol: %d\nGasoline: %d\nDiesel: %d\n", accAlcohol, accGas, accDiesel);
    }
}
