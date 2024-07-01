public class lastOccuranceOfAnElementOfArray {

    public static int lastOccurence(int arr[],int key,int i){
       
       if(i == arr.length){
        return -1;
       }
        int isFound = lastOccurence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }
    public static void main(String args[]){
        int arr[] = {2,3,4,5,3};
        System.out.println(lastOccurence(arr,3,0));
    }
}
