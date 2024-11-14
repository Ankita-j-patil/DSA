// Space Complexity - O(n)
import java.util.*;

public class reverseStack {
    public static void reverseAStack(Stack<Integer> s) {
        Stack<Integer> result = new Stack<>();
        while (!s.isEmpty()) {
            result.push(s.pop());
        }
        
        System.out.println(result);
    }
    
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Original Stack: " + s);
        reverseAStack(s);
        
    }
}
