public class LengthOflastWord {
        public static int lengthOfLastWord(String s) {
            String[] word = s.split(" ");
            String lastWord = word[word.length-1];
            return lastWord.length();
        }
        public static void main(String[] args) {
            System.out.println(lengthOfLastWord("Hakuna Matata"));
        }
    }
