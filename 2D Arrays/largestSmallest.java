import java.util.*;

public class largestSmallest {

    public static int largest(int arr[][]){
        int max =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] >max){
                    max = arr[i][j];
                    
                }
            }
        }
        System.out.println("Largest element is "+max);
        return max;
    }

    public static int smallest(int arr[][]){
        int min =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j] <min){
                    min = arr[i][j];
                    
                }
            }
        }
        System.out.println("smallest element is "+min);
        return min;
    }

    
    public static void main(String args[]){
        int arr[][] = new int[3][3];
        int n = arr.length ,m = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // print
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        largest(arr);
        smallest(arr);
    }
}
