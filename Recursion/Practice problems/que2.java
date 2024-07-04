// You are given a number (eg - 2019), convert it into a String of english like
// “two zero one nine”. Use a recursive function to solve this problem.
// NOTE - The digits of the number will only be in the range 0-9 and the last digit of a number
// can’t be 0.
// Sample Input : 1947
// Sample Output : “one nine four seven

public class que2 {
    static String Digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void convertNumToString(int n){
        if(n == 0){
            return;
        }

        int lastDigit = n%10;
        convertNumToString(n/10);
        System.out.print(Digits[lastDigit]+" ");
    }
    public static void main(String args[]){
        convertNumToString(212);
    }
}
