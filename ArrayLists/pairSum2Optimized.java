import java.util.ArrayList;

public class pairSum2Optimized {

    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int pivot = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
               pivot = i;
               break;
            }
            
        }
        int rp = list.get(pivot);
        int lp = list.get(pivot+1);
        while(lp!=rp){
            if(list.get(lp) + list.get(rp) == target){
                // System.out.println("(" + list.get(lp) + "," + list.get(rp) + ")");
                return true;
                
            }
             if(list.get(lp) + list.get(rp)<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
            
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
       int target = 16;

      System.out.println( pairSum2(list, target));
        
    }
}
