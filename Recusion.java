//Print x^n (stack height = n)
public class Recusion {
    public static int calcPower(int x, int n){
        if (n ==0){
            return 1;
        }
        if (x ==0){
            return 0;
        }
        int Pownm1 = calcPower(x,n-1);
        int Pow = x * Pownm1;
        return Pow;

    }
    public static void main(String args[]){
        int x = 3;
        int n = 3;
        int ans = calcPower(x, n);
        System.out.println("Power of " + x + " raised to " + n + " is: " + ans);
    }
}
