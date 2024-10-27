import java.util.LinkedList;
public class LLUsingJavaCollectionFramework {
    public static void main(String args[]){
        // to create
        LinkedList<Integer> ll = new LinkedList<>();

        // to add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        // to remove
        ll.removeLast();
        System.out.println(ll);
    }
}
