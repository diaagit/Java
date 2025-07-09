import java.util.*;

public class Conditions{
    public static void main(String args[]){

        //if-elseif-else statement
        // try (Scanner sc = new Scanner(System.in)) {
           
        //     int num = sc.nextInt();
            
        //     if(num > 0){
        //         System.out.println("The number is positive.");
        //     } else if(num < 0){
        //         System.out.println("The number is negative.");
        //     } else {
        //         System.out.println("The number is zero.");
        //     }
        // }

        // switch statement
        try(Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();
            
            switch (button) {
                case 1 -> System.out.println("You pressed button 1.");
                case 2 -> System.out.println("You pressed button 2.");
                case 3 -> System.out.println("You pressed button 3.");
                default -> System.out.println("Invalid button.");
            }
        }
        
    }
}