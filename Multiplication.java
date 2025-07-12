import java.util.*;

public class Multiplication {
    public static int calculateMultiplication(int a, int b){
        int mult = a*b;
        return mult;
   }

   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter second number:");
    int b = sc.nextInt();
    int mult = calculateMultiplication(a, b);
    System.out.println("The multiplication of " + a + " and " + b + " is: " + mult);
   }
}
