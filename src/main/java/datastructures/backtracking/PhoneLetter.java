package datastructures.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneLetter {
    static HashMap<Character, String> map = new HashMap<Character, String>();

    static {
        map.put('0', ".;");
        map.put('1', "abc");
        map.put('2', "def");
        map.put('3', "ghi");
        map.put('4', "jkl");
        map.put('5', "mno");
        map.put('6', "pqrs");
        map.put('7', "tu");
        map.put('8', "vwx");
        map.put('9', "yz");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = getKPC(sc.next());

        System.out.print(list.toString());
    }

    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 1) {
            ArrayList<String> list = new ArrayList<String>();
            String s = map.get(str.charAt(0));
            for (char ch : s.toCharArray())
                list.add("" + ch);
            return list;
        }
        char c = str.charAt(0);
        ArrayList<String> list = getKPC(str.substring(1));
        ArrayList<String> res = new ArrayList<String>();

        for (char ch : map.get(c).toCharArray()) {
            for (String l : list) {
                res.add(ch + l);
            }
        }
        return res;
    }
}
