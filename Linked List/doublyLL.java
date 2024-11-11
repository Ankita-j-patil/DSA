public class doublyLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    // ADD
    // AddFirst
    public void addFirst(int data){
        // create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode ;

    }
    // AddLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        tail.next =null;
    }

    // Remove
    // RemoveFirst
    public void removeFirst(){
        if(head.next == null){
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    // RemoveLast
    public void removeLast(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        
        tail.next = null;
        size--;
        
    }

    // reverse
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        doublyLL dll = new doublyLL();
        dll.addLast(3);
        dll.addLast(2);
        dll.addLast(1);
        dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // dll.removeLast();
        dll.reverse();
        dll.print();
    }
}
