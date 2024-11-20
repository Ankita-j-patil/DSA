
import java.util.*;public class nextGreaterOptimized {
    public static void nextGreater(int arr[]){
        Stack<Integer> s = new Stack<>();
        int nextGreaterarr[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] <=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreaterarr[i] = -1;
            }
            else{
                nextGreaterarr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreaterarr.length;i++){
            System.out.print(nextGreaterarr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[] ={6,8,0,1,3};
        int arr1[] = {3,5,0,8,1};
        nextGreater(arr);
        System.out.println();
        nextGreater(arr1);
    }
}
