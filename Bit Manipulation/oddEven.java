public class oddEven {
    public static void oddOrEven(int n){
        // Bitmask means value with which we have to perform and operation
        int bitMask =1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        oddOrEven(3);
        oddOrEven(4);
        oddOrEven(9);

    }
}
