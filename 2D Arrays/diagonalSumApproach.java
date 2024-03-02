// Time complexity:O(1)

public class diagonalSumApproach {

    public static int diagonalsSum(int matrix[][]){
        int sum = 0;

        for(int i=0;i<matrix.length;i++){
            // Primary diagonal
            sum+= matrix[i][i];
            // Secondary diagonal
            // As i+j=n-1 then j =n-i-1
            if(i!= matrix.length-i-1){
            sum+= matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        // int matrix[][] ={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
        int matrix[][] ={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
         diagonalsSum(matrix);
    }
}
