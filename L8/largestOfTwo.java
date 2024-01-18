import java.util.*;
public class largestOfTwo {
    public static void main(String args[]){
        // int a = 14;
        // int b = 6;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc1.nextInt();
        System.out.println("Enter second number: ");
        int b = sc2.nextInt();
        if(a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
