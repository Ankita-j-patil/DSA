import java.util.*;
public class que2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number ;
        int choice;
        int eSum = 0;
        int oSum = 0;

        do{
            System.out.println("Enter the number :");
            number = sc.nextInt();

            if(number%2 == 0){
                eSum+= number;
            }
            else{
                oSum += number;
            }
            System.out.println("Press 1 for inserting next number");
            choice = sc.nextInt();
        }
        while(choice ==1);

        System.out.println("Sum of even numbers : "+eSum);
        System.out.println("Sum of odd numbers : "+oSum);
    }
}
