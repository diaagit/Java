public class Patterns {
    public static void main (String args[]){
        
        //Pattern 1: Solid Rectangle
        for(int i =1; i <=4;  i++){
            for(int j =1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Pattern 2: Hollow Rectangle
        for(int i =1; i <=4;  i++){
            for(int j =1; j<=5; j++){
                if(i == 1 || i == 4 || j == 1 || j == 5){
                    System.out.print("*");
                } else {
                    System.out.print(" ");                  
                }
            }
            System.out.println();
        }

        //Pattern 3: Half Pyramid
         for(int i =1; i<=4 ; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

        //Pattern 4 : Inverted Half Pyramid
        for(int i =4 ; i>=1; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Pattern 5: Right Angled Triangle
        for(int i =1; i<=4 ; i++){
            for(int j =1; j<=4-i; j++){
                System.out.print(" ");// Print spaces for right alignment
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");// Print stars
            }
            System.out.println();
        }  

        //Pattern 6: Half Pyramid with Numbers
        for (int i =1; i<=5; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Pattern 7: Inverted Half Pyramid with Numbers
        for(int i = 5; i>=1 ; i--){
            for(int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    
        //Pattern 8: Floyd's Triangle
        int number = 1; // Starting number
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number for the next position 
            }
            System.out.println(); 
        }
        
        //Pattern 9: 0-1 Triangle
        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); 
        }
        
    }
}
