public class linkedListQueue {
    int size;
    Node head, tail;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    linkedListQueue(){
        size =0;
    }

    void add(int data){
        Node latest = new Node(data);
        if(head == null){
            head = tail = latest;
            size++;
            return;
        }
        tail.next = latest;
        tail = latest;
        size++;
    }

    void remove(){
        if(head==null){
            System.out.println("queue is not available");
            return;
        }
        head = head.next;
    }

    void peek(){
        if(head==null){
            System.out.println("Queue is not there");
            return;
        }
        System.out.println(head.data);
    }

    void isEmpty(){
        if(head == null){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    void printQueue(){
        if(head == null){
            System.out.println("no queue is available");
            return;
        }
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String args[]){
        linkedListQueue llq = new linkedListQueue();
        llq.add(100);
        llq.add(1000);
        llq.add(300);
        llq.add(200);
        System.out.println(llq);
        llq.remove();
        llq.printQueue();
        llq.peek();
        llq.isEmpty();
    }
}
