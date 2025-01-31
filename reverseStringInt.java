
public class reverseStringInt {
    public static void main(String[] args) {
        int num = 121;
        String rev = "";
        String number = Integer.toString(num);
        for(int i = number.length()-1; i>=0; i--){
            char c = number.charAt(i);
            rev+=c;

        }
        int finalrev = Integer.parseInt(rev);
        System.out.println(finalrev);

    }
}
