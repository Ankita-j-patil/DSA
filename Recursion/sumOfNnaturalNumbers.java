public class sumOfNnaturalNumbers {

    public static int sumNatural(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + sumNatural(n-1);
        return sum;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(sumNatural(n));
    }
}
