import java.util.*;

public class largestNumber {
    public static int largestNum(int num[]){
        int largest = Integer.MIN_VALUE;//-infinity
        // int largest =num[0];  //we can also store first value of array
        for(int i=0;i<num.length;i++){
            
            if(num[i]>largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int num[] = {1,2,6,3,5};
        System.out.println("Largest number in array is "+largestNum(num));
    }
}
