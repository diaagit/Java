
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i <11; i++) {
            // System.out.println(i); // Print numbers from 0 to 10 on separate lines
            System.out.print(i+" "); // Print numbers from 0 to 10 on the same line
        }

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("Do-while loop iteration " + k);
            k++;
        } while (k < 5);

        // Sum of first n natural numbers using a loop
        // try (Scanner sc = new Scanner(System.in)) {
        //     int n = sc.nextInt();
        //     int sum = 0;

        //     for(int l =1; l<=n; l++){
        //         sum = sum + l;
        //     }
        //     System.out.println("Sum: " + sum);
        // }

        // Multiplication table using a loop
        try (Scanner sc = new Scanner(System.in)) {
            
            int num = sc.nextInt();
            System.out.println("Multiplication table of " + num + ":");
            for(int m = 1; m<11 ; m++){
                System.out.println(m*num);
            }
        }
    }
}
