
public class Bits {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        //get bit
        if ((bitMask & n)==0){
            System.out.println("bit is zero");
        }else{
            System.out.println("bit is one");
        }

        //set bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        //clear bit
        int newNum = notBitMask & n;
        System.out.println(newNum);

    }
}
