import java.util.HashMap;
class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)==true){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }

        int result =0;
       for(int j : nums){
        if(map.get(j)==1){
            result = j;
            break;
        }
       }
       return result;
    }
}