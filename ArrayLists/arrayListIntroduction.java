import java.util.ArrayList;

public class arrayListIntroduction {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        // add operation
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        // Get operation
        int element = list.get(1);
        System.out.println(element);

        // remove operation
        list.remove(1);
        System.out.println(list);

        // set element at index
        list.set(1,4);
        System.out.println(list);

        // contains in list or not
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));
    }
}
