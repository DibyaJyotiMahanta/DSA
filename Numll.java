import java.util.Scanner;
public class Numll {

    String[] splitString(String str){
        return str.split(",");
    }

    Node head;

   class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next=null;
    }
   }

   void addLast(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node current = head;
    while(current.next!=null){
        current=current.next;
    }
    current.next=newNode;
   }
   void printList(){
    Node current = head;
    while(current!=null){
        System.out.print(current.data+" -> ");
        current=current.next;
    }
    System.out.print("null\n");
   }

   void deleteLL(int data){
    if(head==null){
        System.out.println("deletion is not possible");
        return;
    }
    else if(head.data==data){
        head=head.next;
        return;
    }

    Node prev = head;
    Node current = head.next;

    while(current.data !=data){
        prev=prev.next;
        current=current.next;
    }
    prev.next=current.next;

   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers between 1-50 separated with commas(,) :-");
        String str = sc.nextLine();
        Numll nll=new Numll();
        String[] arr = nll.splitString(str);
        for(String s:arr){
            nll.addLast(Integer.parseInt(s));
        }
        nll.printList();

        System.out.println("deleting less than 25...");
        try {
            Thread.sleep(500);
        }
        catch(Exception e){
            System.out.println(e);
        }

        for(String ele:arr){
            if(Integer.parseInt(ele)>25){
            nll.deleteLL(Integer.parseInt(ele));
            }
        }
        nll.printList();

        sc.close();

    }
}
