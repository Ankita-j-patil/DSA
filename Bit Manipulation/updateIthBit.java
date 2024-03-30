public class updateIthBit {
    // update ith bit
    public static int ClearIthBit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int SetIthBit(int n,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int UpdateIthBit(int n,int i,int newBit){
        if(newBit == 0){
            return ClearIthBit(n,i);
        }
        else{
           return SetIthBit(n,i);
        }
    }

    // Another approach
    public static int UpdateIthBit1(int n,int i,int newBit){
       n = ClearIthBit(n,i);
       int BitMask = newBit<<i;
       return n | BitMask;
    }

    public static void main(String args[]){
        System.out.println(UpdateIthBit1(10,2,1));
    }
}
