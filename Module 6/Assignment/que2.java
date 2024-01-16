import java.util.*;

public class que2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of a square : ");
        float side = sc.nextFloat();

        float area = side*side;
        System.out.println("Area of a square is :");
        System.out.println(area);

        

        sc.close();
    }
}
