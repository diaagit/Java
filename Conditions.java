import java.util.*;

public class Conditions{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            
            if(num > 0){
                System.out.println("The number is positive.");
            } else if(num < 0){
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
        
    }
}