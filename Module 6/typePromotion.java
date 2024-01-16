import java.util.*;
public class typePromotion {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);


        int c = 23;
        float d = 34.56f;
        long e = 45;
        double f = 67;
        double ans = c+d+e+f;
        System.out.println(ans);


        byte g =4;
        byte h = (byte)(g*5);
        System.out.println(h);
    }
}
