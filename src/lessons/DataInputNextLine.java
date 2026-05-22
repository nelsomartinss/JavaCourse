package lessons;

import java.util.Scanner;

public class DataInputNextLine {
    void main(){
       Scanner sc = new Scanner(System.in);
       int x;
       String s1, s2, s3;

       x = sc.nextInt();
       sc.nextLine(); // We need to do this to consume the pending line
       s1 = sc.nextLine(); // Reading data until the line break
       s2 = sc.nextLine();
       s3 = sc.nextLine();

       System.out.println("\nTyped data:");
       System.out.println(x);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
    }
}
