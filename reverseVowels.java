import java.util.ArrayList;
import java.util.List;
public class reverseVowels {
    public static String ReverseVowels(String s) {
        List<String> vowels = new ArrayList<>();
        String temp="";
        String ans = "";
        

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==65 || s.charAt(i)==69 || s.charAt(i)==73 || s.charAt(i)==79 || s.charAt(i)==85 || s.charAt(i)==97 || s.charAt(i)==101 || s.charAt(i)==105 || s.charAt(i)==111 || s.charAt(i)==117){
                temp = temp+s.charAt(i);
                vowels.add(temp);
                temp ="";
            }
          
        }
        int index = vowels.size()-1;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==65 || s.charAt(i)==69 || s.charAt(i)==73 || s.charAt(i)==79 || s.charAt(i)==85 || s.charAt(i)==97 || s.charAt(i)==101 || s.charAt(i)==105 || s.charAt(i)==111 || s.charAt(i)==117){
                if(index<vowels.size() && index>-1){
               ans = ans.concat(vowels.get(index));
               index--;
            }
            }
            else{
                temp = temp+s.charAt(i);
                ans = ans.concat(temp);
                temp="";
            }
        
       
    }
        return ans;
}

public static void main(String[] args) {
    String s = ReverseVowels("heello");
    System.out.println(s);
}
}