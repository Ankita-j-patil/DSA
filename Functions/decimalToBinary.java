public class decimalToBinary {
    public static void decToBin(int decnum){
       int  pow = 0;
       int binNum = 0;
       
        while(decnum>0){
            int rem =decnum%2;
            binNum = binNum + (int)(rem*Math.pow(10,pow));
            pow++;
            decnum = decnum/2;
        }
        System.out.println(binNum);
    }
    public static void main(String args[]){
        decToBin(12 );
    }
}
