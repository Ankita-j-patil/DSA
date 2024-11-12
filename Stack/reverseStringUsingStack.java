import java.util.*;
public class reverseStringUsingStack {
    public static String reverseString(String st){
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i<st.length()){
            s.push(st.charAt(i));
            i++;
        }
        StringBuilder sb = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        
        String st = "ankita";
        System.out.println(reverseString(st));
        


    }
}
