import java.util.*;
public class palindrome {
    public static boolean isPalindrome(int n){
        int pow = 0;
        int palindrome =0;
        while(n!= 0){
            int rem =n%10;
            palindrome =palindrome*10+rem;
            pow++;
            n =n/10;
        }
        if(n == palindrome){
            return true;
        }
        return false;
        
        

    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Number : " + n + " is palindrome");

        }
        else{
            System.out.println("Number : " + n + " is not palindrome");
        }
    }
}
