import java.util.*;

public class numAvg3 {
    public static int avg(int a,int b,int c){
       int  avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int x = sc.nextInt();
        System.out.println("Enter second number : ");
        int y = sc.nextInt();
        System.out.println("Enter third number : ");
        int z = sc.nextInt();

        System.out.println("Average : "+avg(x,y,z));
    }
}
