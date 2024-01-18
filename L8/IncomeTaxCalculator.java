import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String args[]){
        int income = 5000000;

        if(income < 500000){
            System.out.println("You have to pay 0% tax");
        }
        else if(income>= 500000 && income <=1000000){
            System.out.println("You have to pay 20% tax");
        }
        else{
            
                System.out.println("You have to pay 30% tax");
            
        }
    }
}
