public class tilingProblem {
    public static int tilingProblem1(int n){
        if(n==0 || n==1){
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProblem1(n-1);

        // horizontal choice
        int fnm2 = tilingProblem1(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(tilingProblem1(3));
    }
}
