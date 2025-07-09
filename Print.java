

public class Print {
    public static void main(String[] args) {
        // This is a simple Java program that prints messages to the console. 
        
        //println is used to print a line with a newline character at the end,
        
        System.out.println("Hello, World!");

        // print does not add a new line at the end of the output.

        System.out.print("This is a simple Java program. lorem ipsum dolor sit amet, consectetur adipiscing elit.");


        //\n is used to add a new line in the output.
         System.out.println("This is a simple Java program. lorem ipsum dolor sit amet, consectetur adipiscing elit. \n");


         // print does not add a new line at the end of the output.

        System.out.print("This is a simple Java program. lorem ipsum dolor sit amet, consectetur adipiscing elit. \n");

         System.out.println("This is a simple Java program. lorem ipsum dolor sit amet, consectetur adipiscing elit. ");



         //print this pattern
    //      *
    //      * *        
    //      * * *       
    //      * * * *

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

     }
}
