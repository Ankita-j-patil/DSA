import java.util.*;

public class monotonicArrayList {
    public static boolean isMonotonic(ArrayList<Integer> nums){
        boolean asc = true;
        boolean desc = true;
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)<nums.get(i+1)){
                asc = false;
            }
             if(nums.get(i)>nums.get(i+1)){
                desc = false;
            }
        }
        return asc || desc;
    }
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
            
        System.out.println(isMonotonic(nums));
    }
}
