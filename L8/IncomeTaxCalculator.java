import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter income : ");
       int income = sc.nextInt();
       int tax;

        if(income < 500000){
            System.out.println("You have to pay 0% tax");
             tax = 0;
             
        }
        else if(income>= 500000 && income <=1000000){
            System.out.println("You have to pay 20% tax");
             tax = (int)(income* 0.2);
            
        }
        else{
            
                System.out.println("You have to pay 30% tax");
                tax = (int)(income*0.3);
                
            
        }
        System.out.println(tax);
    }
}
