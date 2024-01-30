public class primesInRange {
    public static void traverse(int a,int n){
        for(int i=1;i<=n;i++){
            for( i =2;i<=Math.sqrt(n);i++){
                if(n%i ==0){
                    System.out.println(i);
                }
            }
        }
    }
    public static void main(String args[]){
        System.out.println(traverse(1,10));
    }
}
