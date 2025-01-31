public class LLnum{
    int size;
    Node head;
    LLnum(){
        size=0;
    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
            size++;
        }
    }
    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    void search(int data){
        if(head==null){
            System.out.println("impossible search, the list is null");
        }
        Node currentNode = head;
        for(int i = 0; i<size; i++){
            if(currentNode.data==data){
                System.out.println("\nthe index of "+data+"is "+i);
            }
            currentNode = currentNode.next;
        }
    }
    void print(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LLnum ll = new LLnum();
        ll.addFirst(1);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(8);
        ll.addLast(2);
       ll.print();
       ll.search(7);
    }
}
