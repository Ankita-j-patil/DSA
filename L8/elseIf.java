import java.util.*;
public class elseIf {
    public static void main(String args[]){
        int age = 15;

        if(age<13){
            System.out.println("You are a child");
        }
        else if(age>=13 && age<=18){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are an adult");
        }
    
    }
}
