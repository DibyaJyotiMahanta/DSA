public class circularQueue {
    int size;
    int front, back;
    int[] arr;

    circularQueue(int capacity) {
        size = capacity;
        arr = new int[capacity];
        front = -1;
        back = -1;
    }

    void add(int data) {
        if ((back + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) { 
            front = 0;
        }
        back = (back + 1) % size;
        arr[back] = data;
    }

    void remove(){
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        if(front == back){
            front = back = -1;
            return;
        }
        arr[front] = 0;
        front = (front+1)%size;
    }

    void printQueue() {
        if (front == -1) { 
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == back) break;
            i = (i + 1) % size;
        }
        System.out.println();
    }

    int peek(){
        if(front == -1){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        circularQueue cq = new circularQueue(5);
        cq.add(100);
        cq.add(200);
        cq.add(300);
        cq.add(400);
        cq.add(500);

        cq.printQueue();

        cq.remove();

        cq.printQueue();
        cq.remove();
        cq.printQueue();
        cq.remove();
        cq.remove();
        System.out.println(cq.peek());
        cq.remove();
        System.out.println(cq.peek());
        cq.printQueue();
    }
}
