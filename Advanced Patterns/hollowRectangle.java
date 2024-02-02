import java.util.*;
public class hollowRectangle {
    public static void hollowRect(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i== 1||i==rows||j==1||j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int a = sc.nextInt();
        System.out.println("Enter columns : ");
        int b = sc.nextInt();
            hollowRect(a,b);
    }
}
