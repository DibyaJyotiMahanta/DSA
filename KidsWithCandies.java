import java.util.ArrayList;
import java.util.List;
public class KidsWithCandies{
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        boolean b = true;
        for(int i = 0; i < candies.length; i++){
            int totalCandies = candies[i]+extraCandies;


            for(int j = 0; j<candies.length;j++){
                if(totalCandies<candies[j]){
                    b = false;
                }
               
            }
             l.add(b);
             b=true;
        }
        return l;
        
        }

        public static void main(String args[]){
            int[] candies = {2,3,4,1,2};
            int extraCandy = 2;
            List<Boolean> l = kidsWithCandies(candies, extraCandy);
            System.out.println(l);


        }
}