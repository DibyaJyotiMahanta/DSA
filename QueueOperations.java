public class QueueOperations {
    int size;
    int rear = -1;
    int arr[];
    class Queue{
         Queue(int size){
            arr = new int[size];
            size = 0;
        }
    }
    void add(int Data){
        if(size == arr.length){
            System.out.println("Queue is full!");
            return;
        }
        if(rear!=arr.length){
            rear++;
            size++;
            }
        arr[rear]=Data;
    }

    void remove(){
        if(rear<0){
            System.out.println("Queue is empty");
        }
        for(int i = 0; i<rear; i++){
            arr[i] =arr[i+1];
        }
        size--;
        rear--;
    }

    int peek(){
        if(rear<0){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
    }

    boolean isEmpty(){
        return rear<0;
    }

    void printQueue(){
        if(rear >-1 ){
        for(int i = 0; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    else{
    System.out.println("Queue is not made yet!");
}
}
    public static void main(String[] args){
        QueueOperations qo = new QueueOperations();
        Queue q = qo.new Queue(5);

        qo.add(100);
        qo.add(200);
        qo.add(600);
        qo.add(300);
        qo.printQueue();
        qo.remove();
        qo.printQueue();
        System.out.println(qo.isEmpty());
        System.out.println(qo.peek());
    }
}
