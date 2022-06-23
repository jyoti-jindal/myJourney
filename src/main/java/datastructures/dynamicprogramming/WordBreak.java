package datastructures.dynamicprogramming;

import java.util.HashSet;

public class WordBreak {
    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        String text = "ilikemangoes";
        HashSet<String> set = new HashSet<String>();
        set.add("i");
        set.add("mangoes");
        set.add("man");
        set.add("go");
        set.add("like");
        System.out.println(wordBreak.wordBreak(set, 0, text));
    }

    boolean wordBreak(HashSet<String> set, int s, String text) {

        if (s == text.length()) {
            return true;
        }

        for (int i = s; i < text.length(); i++) {
            if (set.contains(text.substring(s, i + 1))
                    && wordBreak(set, i + 1, text)) {
                return true;
            }
        }
        return false;
    }
}
