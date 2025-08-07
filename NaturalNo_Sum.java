public class NaturalNo_Sum {
    
    //PRINT SUM OF FIRST N NATURAL NUMBERS USING RECURSION
    public static void printSum(int i , int n, int sum){
        if(i== n){
            sum = sum + i;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
            return;
        }
        sum += i;
        printSum(i+1 , n , sum);
        System.out.println(i);
    }
    public static void main (String  [] args){
        printSum(1, 5, 0);
    }
    
}
