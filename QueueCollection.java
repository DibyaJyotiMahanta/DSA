import java.util.*;
public class QueueCollection {
    public static void main(String args[]){
        Queue<Integer> llq = new LinkedList<>();
        llq.add(100);
        llq.add(1000);
        llq.add(300);
        llq.add(200);
        System.out.println(llq);
        llq.remove();
        System.out.println(llq);
        System.out.println(llq.peek());
        System.out.println(llq.isEmpty());
    }
}

