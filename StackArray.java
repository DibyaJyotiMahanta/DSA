import java.util.ArrayList;
public class StackArray {
    ArrayList<Integer> al = new ArrayList<>();

    void push(int data){
        al.add(data);
    }

    void pop(){
        al.remove(al.size()-1);
    }

    int peek(){
        return al.get(al.size()-1);
    }
    
    void printStack(){
        for(int i = al.size()-1; i>=0; i--){
            System.out.println(al.get(i));
        }
    }

    public static void main(String args[]){
        StackArray sa = new StackArray();
        sa.push(100);
        sa.push(200);
        sa.push(300);
        sa.push(400);
        sa.push(500);
        while(sa.al.size()!=0){
            System.out.println(sa.peek());
            sa.pop();
        }
    }
}
