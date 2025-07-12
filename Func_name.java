import java.util.Scanner;

public class Func_name{
    public static void printMyName(String name){
        System.out.println("My name is " + name);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
}
