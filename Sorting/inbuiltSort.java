import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {

    public static void printArray(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {3,5,1,2,4};
    //    Sorted array in ascending order
        // Arrays.sort(arr,0,3);

        // Sorted array in descending order
        Arrays.sort(arr,Collections.reverseOrder());
        printArray(arr);
    }
}
