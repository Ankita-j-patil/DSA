public class fibonacci {

    public static int fibonacciNum(int n){
        if(n == 0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fn =  fibonacciNum(n-1)+ fibonacciNum(n-2);
        return fn;
    }
    public static void main(String args[]){
        int n = 4 ;
        System.out.println(fibonacciNum(n));
    }
}
