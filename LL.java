public class LL {
    

    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next = null;
            size++;
        }
    }
    Node head;
    int size;

    LL(){
        size=0;
    }
    //Add First method
    void AddFirst(String Data){
        Node newNode = new Node(Data);
        newNode.next = head;
        head=newNode;
    }

    //add Last method
    void addLast(String Data){
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

    //print list
    void printList(){
        if(head==null){
            System.out.println("null");
        }
        Node LastNodee= head;
        while(LastNodee!=null){
            System.out.print(LastNodee.data+"->");
            LastNodee=LastNodee.next;
        }
        System.out.print("null");
    }

    //removeFirst
    void removeFirst(){
        if(head==null){
            System.out.println("it is already null, cannot remove");
        }
        head = head.next;
        size--;
    }

    //remove Last
    void removeLast(){
        if(head==null){
            System.out.println("cannot remove cause the list is null");
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node Prenode = head;
        Node currentNode = head.next;
        while(currentNode.next!=null){
            Prenode = currentNode;
            currentNode=currentNode.next;
        }
        Prenode.next = null;
    }

    //print size
    void size(){
        System.out.println(size);
    }

    //insert inbetween
    void insertInBetween(int point, String data){
        if(point<0 || point>size){
            System.out.println("invalid position");
        }
        Node newNode = new Node(data);
        Node currentNode = head;
        size++;
        for(int i = 1; i<size; i++){
            currentNode = currentNode.next;
            if(i==point){
                Node nxtNode = currentNode.next;
                newNode.next =nxtNode;
                currentNode.next = newNode;
            }
        }

    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.AddFirst("I");
        ll.addLast("Mahanta");
        ll.addLast("Soham");
        ll.printList();
        System.out.println("");
        // ll.size();
        // ll.removeFirst();
        // ll.printList();
        // System.out.println("");
        // ll.removeLast();
        // ll.printList();
        // System.out.println("");
        ll.size();
        ll.insertInBetween(1, "am");
        ll.printList();
    }
}