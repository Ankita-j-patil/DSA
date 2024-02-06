public class reverseArray {

        public static void reverseAnArray(int arr[]){
            int start =0;
            int end =arr.length-1;
            while(start<end){
                // swap
                int temp =arr[end];
                arr[end] = arr[start];
                arr[start]=temp;

                start++;
                end--;
            }
        }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        reverseAnArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
