import java.util.ArrayList;

public class pairSum1Optimized {
    public static void pairSum(ArrayList<Integer> list,int target){
        int lp = 0, rp = list.size()-1;
        int sum =0;
        while(lp<rp){
            sum = list.get(lp) + list.get(rp);
            if(sum == target){
                System.out.println("(" + list.get(lp) + ","+ list.get(rp) + ")");
                break;
            } 
            else if(sum<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       int target = 5;

      pairSum(list, target);
        
    }
}

// 2 pointer appraoch
// time complexity:O(n)