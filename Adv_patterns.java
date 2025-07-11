public class Adv_patterns {
    public static void main(String args[]){
        //Pattern 1: Butterfly Pattern

        int n = 5;
        for(int i =1; i<=n ; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for(int j =1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1 ; i--){
            for(int j =1; j<=i; j++){
                System.out.print("*");  
            }
            for(int j =1 ; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Pattern 2: Solid Rhombus

        
        for (int i =1;i<=n; i++){
            for(int j =1 ;j<=n-i; j++){
                System.out.print(" ");// Print spaces for right alignment
            }
            for(int j = 1; j<=5; j++){
                System.out.print("* ");// Print stars with space
            }
            System.out.println();
        }

        //Pattern 3: Hollow Rhombus
        for (int i =1;i<=n; i++){
            for(int j =1 ;j<=n-i; j++){
                System.out.print(" ");// Print spaces for right alignment   
            }
            for(int j =1; j<=5; j++){
                if(i == 1 || i == n || j == 1 || j == 5){
                    System.out.print("* ");// Print stars with space
                } else {
                    System.out.print("  ");// Print spaces
                }
            }
            System.out.println();
        }

        //Pattern 4: Number Pyramidx

        for(int i = 1; i<=n ; i++){
            for(int j =1 ; j<=n-i; j++){
                System.out.print(" ");// Print spaces for right alignment
            }
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");// Print stars with space
            }
            System.out.println();
        }

        //Pattern 5: Palindromic Pattern

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print(" ");// Print spaces for right alignment
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);// Print decreasing numbers
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j);// Print increasing numbers
            }
            System.out.println();
        }

        //Pattern 6: Diamond Pattern
        for(int i =1; i<=n ; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");// Print spaces for right alignment
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");// Print stars
            }
            System.out.println();
        }
         for(int i =n; i>=1 ; i--){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");// Print spaces for right alignment
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");// Print stars
            }
            System.out.println();
        }
    }
}
