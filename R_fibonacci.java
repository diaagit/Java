public class R_fibonacci {
    public static void printFibonacci(int a, int b, int n){
        if ( n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci( b, c, n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFibonacci(a, b, n-2);// n-2 because we already printed the first two numbers
        System.out.println("Fibonacci series up to " + n + " terms is printed above.");
    }
    
}
