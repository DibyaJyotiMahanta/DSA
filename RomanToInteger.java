
import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int j = 1;
        int value = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c2 = s.charAt(j);

            if (m.get(c) < m.get(c2)) {
                value -= m.get(c);
            } else {
                value += m.get(c);
            }

            if (j < s.length() - 1) {
                j++;
            }

        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LXXVIII"));
    }
}
