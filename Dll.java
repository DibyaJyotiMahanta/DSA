public class Dll {
    Node head;
    Node tail;
    int size;

    class Node{
        int data;
        Node next;
        Node previous;
        Node(int data){
            this.data = data;
            next =null;
            previous =null;
            size++;
        }
    }
    Dll(){
        size =0;
    }

    void addFrist(int data){
        Node newNode = new Node(data);
        if(head ==null && tail==null){
            head = tail = newNode;
            return;
        }
        head.previous = newNode;
        newNode.next = head;
        head = newNode;
    }

    void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null && head == null){
            tail = head = newNode;
        }
        tail.next = newNode;
        newNode.previous =tail;
        tail = newNode;
    }

    void deleteFirst(){
        if(head==null && tail==null){
            System.out.println("nothing to delete");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
           
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    void deleteLast(){
        if(head==null && tail==null){
            System.out.println("nothing to delete");
            return;
        }
        if(head==tail){
            head=tail=null;
            size--;
            return;
        }
        tail = tail.previous;
        tail.next = null;
        size--;

    }

    void printForward(){
        Node current = head;
        System.out.print("null <--> ");
        while(current!=null){
            System.out.print(current.data+" <--> ");
            current = current.next;
        }
        System.out.println("null");
    }

    void printBackward(){
        Node current = tail;
        System.out.print("null <--> ");
        while(current!=null){
            System.out.print(current.data+" <--> ");
            current = current.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Dll ddl = new Dll();
        
      ddl.printForward();
}
}
