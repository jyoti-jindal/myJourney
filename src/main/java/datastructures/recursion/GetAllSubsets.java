package datastructures.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetAllSubsets {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = gss(sc.next());
        System.out.println(res);

    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char c = str.charAt(0);
        ArrayList<String> list = gss(str.substring(1));
        ArrayList<String> newList = new ArrayList<String>();
        for (String l : list) {
            newList.add(l);
            newList.add(c + l);
        }
        return newList;
    }
}
