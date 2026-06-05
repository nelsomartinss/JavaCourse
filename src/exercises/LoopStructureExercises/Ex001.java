package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex001 {
    void main(){
        int x, y;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter a X: ");
            x = sc.nextInt();
            System.out.print("Enter a Y: ");
            y = sc.nextInt();

            if(x > y){
               System.out.println("Decreasing");
            } else if(x < y){
                System.out.println("Increasing");
            } else {
                System.out.println("Equal");
                break;
            }
        }

        sc.close();
    }
}
