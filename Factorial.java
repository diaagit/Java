import java.util.Scanner;

public class Factorial {
   public static void printFactorial(int n){
    int factorial = 1;
    if (n<0){
        System.out.println("Factorial is not defined for negative numbers.");
        return;
    }
    for(int i = n; i>=1 ; i--){
        factorial = factorial * i;

    }
    System.out.println("The factorial of " + n + " is: " + factorial);
    
   }
    public static void main (String args []){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to calculate its factorial:");
            int n = sc.nextInt();
            printFactorial(n);
        }
    }
    
}
