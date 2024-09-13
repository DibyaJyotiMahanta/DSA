import java.util.ArrayList;

public class Number_of_1_bits {
    public  static  int  numberOfBits(int n){
        ArrayList<Integer> bits = new ArrayList<>();
    while(n > 0){
      bits.add(n % 2);
      n /= 2;
    }
    int count =0;
    for(int i = 0; i < bits.size(); i++){
      if(bits.get(i) == 1){
        count++;
      }
    }
    return count;
    }
    public static void main(String[] args) {
        System.out.println(numberOfBits(11));
    }
}
