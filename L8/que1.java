import java.util.*;

public class que1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println(num + " is a Negative Number");
        }
        else{
            System.out.println(num + " is a Positive Number");
        }
    }
}
