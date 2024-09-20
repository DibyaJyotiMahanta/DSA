public class ShortestPalindrome {
    public static String upsidedown(String str) {
         String reverse = "";
         for (int i = str.length() - 1; i >= 0; i--) {
             char c = str.charAt(i);
             reverse = reverse + c;
         }
         return reverse;
     }
 
     
 
     public String shortestPalindrome(String s) {
         String reverse = upsidedown(s);
         int i = 0;
         
 
         for (int j = s.length(); j >= 0; j--) {
             if (s.substring(0, j).equals(reverse.substring(s.length() - j))) {
                 i = j;
                 break;
             }
         }
      
         String result = reverse.substring(0, s.length() - i) + s;
         return result;
     }
 }
