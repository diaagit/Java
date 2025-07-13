
import java.util.Scanner;

public class Average {
    public static int printAverage(int num1 , int num2, int num3){
        int average = (num1 + num2 +num3)/3;
        System.out.println("The average of the three numbers is: " + average);
        return average;
    }
    public static void main( String args []){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the third number: ");
            int num3 = sc.nextInt();
            printAverage(num1, num2, num3);
        }
    }
}
 