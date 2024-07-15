public class gridWays {
    public static int countGridWays(int i,int j,int n,int m){
        // base case
        if(i ==n-1 && j ==m-1){
            return 1;
        }
        else if(i ==n || j==n){
            return 0;
        }
        int w1 = countGridWays(i+1, j, n, m);
        int w2 = countGridWays(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String args[]){
       int n =3;
       int m =3; 
       System.out.println(countGridWays(0, 0, n, m));
    }
}

// Time Complexity:O(n+m)