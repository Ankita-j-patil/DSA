// Time Complexity : O(n) 
import java.util.*;
public class duplicateParentheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int cnt = 0;
            while(s.peek()!='('){
                s.pop();
                cnt++;
            }
            if(cnt<1){
                return true;
            }
            s.pop();
            }
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str1 ="((a+b))";
        String str2 = "((a+b)-(c*d))";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2)); 
    }
}
