package Exercises.LoopStructureExercises;

import java.util.Scanner;

public class Ex003 {
    void main(){
        String password = "2002", passwordInput;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter password: ");
            passwordInput = sc.nextLine();

            if (passwordInput.equals(password)){
                System.out.println("Access granted");
                break;
            } else {
                System.out.println("Access denied");
            }
        }

        sc.close();
    }
}
