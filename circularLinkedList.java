public class circularLinkedList {
    Node head;
    Node tail;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    circularLinkedList(){
        size =0;
    }

    void addFirst(int data){
        Node element = new Node(data);

        if(head==null && tail == null){
            head = tail = element;
            tail.next = head;
            size++;
            return;
        }
        element.next = head;
        head = element;
        tail.next = head;
    }



    void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null && head == null){
            tail=head =newNode;
            tail.next = head;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;
        size++;
    }

    void printList(){
        if(head == null){
            System.out.println("nothing to print");
            return;
        }
        Node current = head;
        while(current.next!=head){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print(tail.data+"->");
        System.out.println(head.data);
    }


    void deleteFirst(){
        if(head == null){
            System.out.println("Nothing to delete");
            return;
        }
        if(head == tail){
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        tail.next = head;
        size--;
    }

    void deleteLast(){
        if(tail == null){
            System.out.println("nothing to print");
            return;
        }
        if(tail == head){
            tail=head=null;
            size--;
            return;
        }
        Node current = head;
        while(current.next !=tail){
            current = current.next;
        }
        tail=current;
        tail.next = head;
    }


    public static void main(String[] args) {
        circularLinkedList cll = new circularLinkedList();
        for(int i = 0; i<=5;i++){
            cll.addFirst(i);
        }
        cll.printList();
        cll.addLast(11);
        cll.addLast(12);
        cll.printList();
        cll.addFirst(100);
        cll.printList();
        cll.deleteFirst();
        cll.printList();
        cll.deleteLast();
        cll.printList();
    }
}
