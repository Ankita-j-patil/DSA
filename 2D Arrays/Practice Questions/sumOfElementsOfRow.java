// Print out the sum of the numbers in the second row of the “nums” array.

public class sumOfElementsOfRow {
    public static int rowSum(int nums[][] ){
        int sum =0;
        int i=1;
        for(int j=0;j<nums[0].length;j++){
            sum+= nums[i][j];
        }
           
        
        return sum;
    }
    public static void main(String args[]){
        int nums[][] = { {1,4,9},
                        {11,4,3},
                        {2,2,3} };
        System.out.println(rowSum(nums));
    }
}
