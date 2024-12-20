public class removeCycleInLL {
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

    public static boolean isCycle(){
        Node slow =head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        // cycle detection
        Node slow =head;
        Node fast =head;
        boolean cycle =false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }
        // find last node
        slow = head;
        Node prev =null;
       if(cycle == true){
            while(slow != fast){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null;
       }
        
    }
    
    public static void main(String args[]){
       head = new Node(1);
       Node temp = new Node(2);
       head.next = temp;
       head.next.next = new Node(3);
       head.next.next.next = temp; 
       //1->2->3->2 
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
        
        
       
}
}
