public class reverseLLRecursive { Node head;


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
    

    void reverseRecursive(Node previous, Node current, Node nxt){

        if(previous==head){
            previous.next = null;
        }

        if(nxt == null){
            current.next = previous;
            head = current;
            return;
        }
        
        current.next = previous;

        previous = current;
        current = nxt;
        nxt = current.next;

       reverseRecursive(previous, current, nxt); 
    }


    public static void main(String[] args) {
        reverseLLRecursive rll = new reverseLLRecursive();
        for(int i = 1; i<=6; i++){
            rll.addLast(i);
        }

        rll.print();
        Node previous = rll.head;
        Node current = previous.next;
        Node nxt = current.next;
        rll.reverseRecursive(previous, current, nxt);

        rll.print();




    }
}
