public class R_factorial {
    public static int cal_factorial(int n){
        if ( n ==1 || n ==0){
            return 1;
        }
        int fact_nm1 = cal_factorial(n-1);
        int fact = n*fact_nm1;
        return fact;

    }
    public static void main(String []args){
        int n = 5;
        int ans = cal_factorial(n);
        System.out.println("Factorial of " + n + " is: " + ans);
    }
    
}
