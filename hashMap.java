import java.util.HashMap;
public class hashMap {
    public static void main(String args[]){
        String fruits[] = {"apple", "mango", "mango", "apple", "banana","pineapple", "banana"};
        HashMap<String, Integer> h = new HashMap<>();
        for(int i = 0; i<fruits.length; i++){
            if(h.containsKey(fruits[i])){
                h.put(fruits[i], h.get(fruits[i])+1);
            }else{
            h.put(fruits[i], 1);
            }
        }
        for(String fruit : h.keySet()){
            System.out.println(fruit+"-->"+h.get(fruit));
        }
    }
}
