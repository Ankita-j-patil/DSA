import java.util.*;

public class functions_parameters {
    
    public static int sum(int a,int b){ //formal parameters
        int sum = a + b;
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
        int sum =sum( a, b);  //actual parameters
        System.out.println("Sum is : "+sum);
    }
}
