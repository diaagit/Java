import java.util.Scanner;

public class Sum {
    public static int calculateSum(int a, int b) {
       int sum = a + b;
        return sum;
    }

    public static void  main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        
    }
}
