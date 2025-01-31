public class reverseLL {
    Node head;


    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }


    void addLast(int Data){
        Node newNode = new Node(Data);

        if(head==null){
            head=newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }


    void print(){
        Node currentNode = head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }

    void reverse(){
        Node previous = head;
        Node current = head.next;
        Node nxt = current.next;

        while(nxt!=null){
            if(previous==head){
                previous.next = null;
            }
            current.next = previous;

            previous = current;
            current = nxt;
            nxt = current.next;
        }
        current.next = previous;
        head = current;
    }


    public static void main(String[] args) {
        reverseLL rll = new reverseLL();
        for(int i = 1; i<=6; i++){
            rll.addLast(i);
        }
        rll.print();

        rll.reverse();
        rll.print();


    }
}
