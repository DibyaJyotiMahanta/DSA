public class Stack {
   Node head;
   int size;
   
   Stack(){
    size =0;
   }

   class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data =data;
        next =null;
    }
   }

   void push(int data){
    Node latest = new Node(data);

    if(head ==null){
        head =latest;
        size++;
        return;
    }

    latest.next =head;
    head =latest;
    size++;
   }

   void pop(){
    if(head == null){
        System.out.println("No stack exists yet");
        return;
    }
    if(head.next == null){
        head=null;
        size--;
        return;
    }
    head =head.next;
    size--;
   }

   int peek(){
    if(head==null){
        System.out.println("No stack available.");
        return -1;
    }
    return head.data;
   }

   void printStack(){
    if(head == null){
        System.out.println("null");
        return;
    }
    Node currentNode = head;
    while(currentNode!=null){
        System.out.print(currentNode.data+"->");
        currentNode = currentNode.next;
    }
    System.out.println("null");
   }

   public static void main(String[] args){
    Stack s =new Stack();
   s.push(1);
   s.push(2);
   s.push(3);
   s.push(4);
   s.push(5);
   while(s.head!=null){
    System.out.println(s.peek());
    s.pop();
   }
   }
}
