import java.util.*;

public class factorial {

    public static int factorial(int n){
      
        int fact =1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
        
    }
    public static void main(String args[]){
        // int n =4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
       System.out.println(factorial(n));
    }
}
