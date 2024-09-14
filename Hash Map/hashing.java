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

    }
}
