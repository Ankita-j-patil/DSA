public class removeLastInLL {
    public static class Node{
        int data;
        Node next; //node creation

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step1 create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step2 newNode next = head
        newNode.next = head; //link

        // step3 head = newNode
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

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
        }
        else if(size == 1){
            int val =head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node prev = head;
        int val = prev.next.data;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        prev.next =null;
        tail =prev;
        size--;
        return val;
    }
    
    public static void main(String args[]){
        removeLastInLL ll = new removeLastInLL();
        ll.addFirst(2);
        ll.addFirst(1);
         ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3 );
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
       
}
}