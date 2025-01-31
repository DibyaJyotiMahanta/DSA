import java.util.Stack;
public class StackInsertBottomRecursion {

    static void insertAtBottom(int data, Stack<Integer>s){
        if(s.size()==0){
            s.push(data);
            return;
        }

        int a = s.pop();
        insertAtBottom(data, s);
        s.push(a);
        
    } 
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        insertAtBottom(100, s);

        while(s.size()!=0){
            System.out.println(s.pop());
        }

    }
}
