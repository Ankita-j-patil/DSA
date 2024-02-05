import java.util.*;
public class smallestNumber {
    public static int smallestNum(int num[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<smallest){
                smallest =num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int num[] = {1,2,6,3,5};
        System.out.println("Smallest value in array is "+smallestNum(num));
    }
}
