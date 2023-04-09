
import java.util.*;

public class program {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter first word ");
        String word1 = inp.next();
        System.out.println("Enter second word ");
        String word2 = inp.next();
        inp.close();
        System.out.println(checkIfIzom(word1, word2));

    }

    static Boolean checkIfIzom(String word_1, String word_2) {
        StringBuilder str1 = new StringBuilder(word_1);
        StringBuilder str2 = new StringBuilder(word_2);
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int count = str1.length();
            Map<Character, Character> dict = new HashMap<Character, Character>(count);
            for (int i = 0; i < count; i++) {
                if (dict.containsKey(str1.charAt(i))) {
                    if (dict.get(str1.charAt(i)) != str2.charAt(i)) {
                        return false;
                    }

                } else if (dict.containsValue(str2.charAt(i))) {
                    return false;
                } else
                    dict.put(str1.charAt(i), str2.charAt(i));
            }
            return true;
        }
    }
}