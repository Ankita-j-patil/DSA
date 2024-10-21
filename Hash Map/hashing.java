import java.util.*;

public class hashing {
    public static void main(String args[]){
        // Create Hash Map
        HashMap<String,Integer> map = new HashMap<>();

        // Insert key value pair
        map.put("India",120);
        map.put("China",150);
        map.put("USA",50);

        System.out.println(map);

        // Key value pair updation
        map.put("USA",70);

        System.out.println(map);
        
        // search
        if(map.containsKey("China")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key is not present");
        }

        System.out.println(map.get("USA"));
        System.out.println(map.get("Nepal"));

        // int arr[] = {23,54,34};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] +" ");
        // }
        // System.out.println();

        // Another syntax for writing for loop
        // for(int val :arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        // Writing for loop in hash map(Using entry set)
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
            System.out.println();
        }

        // Writing for loop in hash map(Using key set)
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key + " " + map.get(key));
        }
       
        // Remove key-value pair from map
        map.remove("China");
        System.out.println(map);

    }
}
