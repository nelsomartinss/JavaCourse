package Lessons.OtherTopics;

import java.util.Scanner;

public class Functions { // class
    void main(){ // function main (default; executed first)

        int a, b, c, higher;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        System.out.print("Enter third number: ");
        c = sc.nextInt();

        higher = Max(a,b,c);
        ShowResult(higher);

        sc.close();
    }

    public static int Max(int n1, int n2, int n3){
        int higher; //  internal exclusive variable

        if (n1 > n2 && n1 > n3){
            higher = n1;
        } else if (n2 > n3){
            higher = n2;
        } else {
           higher = n3;
        }
        return higher;
    }
    // function that does not return anything
    public static void ShowResult(int value){
        System.out.printf("Higher number: %s", value);
    }
}
