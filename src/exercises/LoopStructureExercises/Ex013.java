package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex013 {
    void main(){
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}
