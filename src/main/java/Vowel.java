public class Vowel {
    public String str(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                return "Vowel";
            } else {
                return "Consonent";
            }
        }
    }
}




