public class Insertion_sort {
    public static void main (String [] args){
        int arr [] = {64, 25, 12, 22, 11};
        for(int i = 1; i< arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
     
}
