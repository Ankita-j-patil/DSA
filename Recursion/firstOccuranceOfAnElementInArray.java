public class firstOccuranceOfAnElementInArray {

    public static int firstOccurance(int arr[] , int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
    
        return firstOccurance(arr,key,i+1);
        
    }
    
    public static void main(String args[]){
        int arr[] = {2,4,5,6,2};
    System.out.println(firstOccurance(arr,5,0));
    }
}
