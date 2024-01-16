import java.util.*;

public class unaryOperators {
    public static void main(String args[]){
        // pre Increment operator
        int a = 23;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // post Increment operator
        int c = 2;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        // pre decrement operator
        int e = 23;
        int f = --e;
        System.out.println(e);
        System.out.println(f);

        // post decrement operator
        int g = 23;
        int h = g--;
        System.out.println(g);
        System.out.println(h);
    }
}
