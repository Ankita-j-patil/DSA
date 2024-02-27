// Selection Sort
public class selectionSort {
    public static void selectionSorting(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            int smallest =turn;
            for(int j=turn+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[turn];
            arr[turn] = temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        selectionSorting(arr);
        printArray(arr);
    }
}

// Time Complexity : O(n^2)
