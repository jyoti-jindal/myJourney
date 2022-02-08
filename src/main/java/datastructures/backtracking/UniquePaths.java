package datastructures.backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> list = getMazePaths(1, 1, n, m);
        System.out.println(list.toString());
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc && sr == dr) {
            ArrayList<String> paths = new ArrayList();
            paths.add("");
            return paths;
        }
        ArrayList<String> hPaths = new ArrayList<String>();
        ArrayList<String> vPaths = new ArrayList<String>();

        if(sc<dc)
            hPaths = getMazePaths(sr, sc+1, dr, dc);

        if(sr<dr)
            vPaths = getMazePaths(sr+1, sc, dr, dc);

        ArrayList<String> paths = new ArrayList();
        for(String s: hPaths) {
            paths.add("h"+s);
        }
        for(String s: vPaths) {
            paths.add("v"+s);
        }
        return paths;
    }
}
