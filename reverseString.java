public class reverseString {
    public static void main(String[] args) {
        String str = "piggip";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            char c = str.charAt(i);
            rev+=c;
        }
        System.out.println(rev.equals(str));
    }
}
