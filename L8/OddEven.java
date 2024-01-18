import java.util.*;
public class OddEven {
    public static void main(String args[]){
        // int a = 49;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println(a+" is even number");
        }
        else{
            System.out.println(a+" is odd number");
        }
    }
}
