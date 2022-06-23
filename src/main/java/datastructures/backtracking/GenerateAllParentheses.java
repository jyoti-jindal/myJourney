package datastructures.backtracking;

import java.util.ArrayList;

public class GenerateAllParentheses {
    public static void main(String[] args) {
        String[] res = generateParenthesis(1);
        for (String s : res) {
            System.out.print(s + " ");
        }
    }

    public static String[] generateParenthesis(int A) {
        ArrayList<String> list = new ArrayList<String>();
        generateParenthesis("", 0, 0, A, list);
        String[] st = new String[list.size()];
        int i = 0;
        for (String s : list) {
            st[i++] = s;
        }
        return st;
    }

    public static void generateParenthesis(String s, int countO, int countC, int A, ArrayList<String> list) {
        if (s.length() == 2 * A) {
            list.add(s);
            return;
        }
        if (countO < A) {
            generateParenthesis(s + "(", countO + 1, countC, A, list);
        }
        if (countC < countO) {
            generateParenthesis(s + ")", countO, countC + 1, A, list);
        }
    }
}
