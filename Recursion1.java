public class Recursion1 {

    //PRINT NUMBERS FROM 1 TO N USING RECURSION
    // public static void printNumb(int n){
    //     if(n ==6){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n+1);
    // }
    // public static void main (String args []){
    //     int n = 1;
    //     printNumb(n);
        
    // }

    //PRINT NUMBERS FROM N TO 1 USING RECURSION
    public static void printNumb(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main (String args[]){
        int n = 5;
        printNumb(n);
    }
    
}
