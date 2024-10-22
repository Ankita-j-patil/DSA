// Using ArrayList Data Structure
// TC - O(n)  SC- O(n)
import java.util.*;
public class palindromeLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head; 
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public boolean isPalindrome(){
        ArrayList<Integer> list = new ArrayList<>();
        Node temp =head;
        while(temp!=null){
            int val = temp.data;
            list.add(val);
            temp = temp.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<=j){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[]){
        palindromeLL ll = new palindromeLL();
        ll.addFirst(2);
        ll.addFirst(1);
         ll.addLast(1);
        // ll.addLast(5);
        // ll.add(2,3 );
        ll.print();
        System.out.println(ll.isPalindrome());
        
        
       
}
}
