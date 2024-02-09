// Time complexity - O(log n)

public class binarySearch {
    public static int binSearch(int arr[],int key){
        int start = 0;
        int end =arr.length-1 ;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(key == arr[mid] ){ 
                return mid;
            }
            else if(key>arr[mid]){
                start = mid+1;

            }
            else {
                end = mid-1;
            }
          
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12,14,16};
        int key = 4;
        int index =binSearch(arr,key);
       
            System.out.println("Key found at index "+index);
        
    }
}
