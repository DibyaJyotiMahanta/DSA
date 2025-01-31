import java.util.Stack;
public class StackInsertBottom {

    static void insertAtBottom(int data, Stack<Integer>s){
        int arr[] = new int[s.size()];
        int i = s.size()-1;
        while(i!=-1){
            arr[i]= s.pop();
            i--;
        }
        s.push(data);
        for(int ele : arr){
            s.push(ele);
        }

    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        insertAtBottom(100, s);
        while(s.size()!=0){
            System.out.println((int)s.pop());
        }
    }
}
