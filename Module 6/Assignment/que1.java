import java.util.*;

public class que1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
         System.out.println("Enter number1");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println("Enter number2");
        int b = sc.nextInt();
        System.out.println(b);

        System.out.println("Enter number3");
        int c = sc.nextInt();
        System.out.println(c);

        int avg = (a+b+c)/3;
        System.out.println("Aversge is ");
        System.out.println(avg);

        sc.close();
    }
}
