import java.util.Scanner;

public class factorial {
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();


       System.out.println(Factorial(num));
        sc.close();
    }
    
}
