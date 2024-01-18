import java.util.*;
public class if_else {
    public static void main(String args[]){
    // int age = 5;

    System.out.println("Enter your Age : ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();

    if(age >= 18){
        System.out.println("You are eligible for voting");

    }
    else{
        System.out.println("You are not an adult");
    }
}
}
