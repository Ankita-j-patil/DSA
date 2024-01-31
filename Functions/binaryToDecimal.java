public class binaryToDecimal {
    public static void binToDec(int n){
        int power = 0;
        int decimal = 0;

        while(n>0){
            int lastDigit = n%10;
            decimal = decimal +(int) (lastDigit* Math.pow(2,power));
            power++;
            n = n/10;
        }
        System.out.println(decimal);
    }
    public static void main(String args[]){
        binToDec(111 );
    }
}
