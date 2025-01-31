import java.util.Stack;
public class Stackframework {
    public static void main(String args[]){
        Stack<Integer> sa = new Stack<>();
        sa.push(100);
        sa.push(200);
        sa.push(300);
        sa.push(400);
        sa.push(500);
        while(sa.size()!=0){
            System.out.println(sa.peek());
            sa.pop();
        }
    }
}

