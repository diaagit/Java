
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7};
        System.out.print("Before swap:");
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.print("After swap:");
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int []arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
}
