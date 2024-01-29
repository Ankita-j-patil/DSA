import java.util.*;
public class binomialCoefficient {

    public static int factorial(int n){
        int fact =1;
        for(int i=1;i<=n;i++){
            fact =fact*i;
        }
        return fact;
    }

    public static int binomialCoefficient(int n,int r){
        int nFact =factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n-r);
        int nCr = nFact/(rFact*nrFact);
        return nCr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n =sc.nextInt();
        System.out.println("Enter value of r : ");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient : "+binomialCoefficient(n,r));
    }
}
