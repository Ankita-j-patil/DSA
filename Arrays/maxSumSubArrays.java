public class maxSumSubArrays {
    public static void maxSubarraySum(int arr[]){
        int curSum =0;
        int maxSum =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start =i;
            for (int j=i;j<arr.length;j++){
                int end =j;
                curSum =0;
                for(int k=start;k<=end;k++){
                    // sum of subArrays
                    curSum += arr[k];
                }
                System.out.println(curSum);
                if(maxSum<curSum){
                    maxSum = curSum; 
                }
                
            }
            
        }
        System.out.println("Max sum = "+maxSum);
    }
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        maxSubarraySum(arr);
    }
}
