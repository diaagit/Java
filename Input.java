import java.util.*;
public class Input {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
             System.out.print("Enter a:");
             int a = sc.nextInt();
             System.out.print("Enter b:");
             int b = sc.nextInt();
            
             int sum = a + b;
             System.out.println("The sum of " + a + " and " + b + " is: " + sum);
         }
    }
    
}
