import java.util.*;
public class largestOfThree {
    public static void main(String args[]){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = sc1.nextInt();

System.out.println("Enter number 2");
        int b = sc2.nextInt();

        System.out.println("Enter number 3");
        int c = sc3.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is greatest");
        }
        else{
            System.out.println(c+" is greatest");
        }
    }
}
