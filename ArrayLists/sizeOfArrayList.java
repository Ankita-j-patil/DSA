import java.util.ArrayList;

public class sizeOfArrayList {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.size());

        // print ArrayList
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
