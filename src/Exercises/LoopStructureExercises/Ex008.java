package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex008 {
    void main(){
        int x;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X number: ");
        x = sc.nextInt();

        for(int i = 1; i <= x; i++){
            if(i % 2 != 0){
                System.out.println("Odd number: " + i);
            }
        }
    }
}
