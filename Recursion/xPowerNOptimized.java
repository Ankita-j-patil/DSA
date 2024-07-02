public class xPowerNOptimized {

    public static int optimizedPower(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfPower = optimizedPower(a,n/2);
        int halfPowerSq = halfPower*halfPower;

        if(n%2 !=0){
            halfPowerSq = a * optimizedPower(a,n/2)*optimizedPower(a,n/2);
        }
        return halfPowerSq;
    }
    public static void main(String args[]){
       
        System.out.println(optimizedPower(2,10));
    }
}

// Time complexity : O(logn)