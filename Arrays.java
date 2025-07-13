
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // Input elements into the array
        for(int i = 0; i<size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int x = sc.nextInt();

        
        for(int i = 0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("Element " + x + " found at index: " + i);
                break;
            }
          
        }
     }
        
    }
}
