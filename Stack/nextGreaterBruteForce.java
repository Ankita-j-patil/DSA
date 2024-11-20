import java.util.*;
public class nextGreaterBruteForce {
    public static void nextGreater(int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i==arr.length-1){
                    list.add(-1);
                }
                if(arr[j]>arr[i]){
                    list.add(arr[j]);
                    break;
                }
                if(arr[j]<arr[i]){
                    list.add(-1);
                    break;
                }
            }
        }
        System.out.println(list);
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        nextGreater(arr);
    }
}
