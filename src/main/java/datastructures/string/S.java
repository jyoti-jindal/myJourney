package datastructures.string;

public class S {
    public static void main(String[] args) {
        String str1 = "1253234";
        String str2 = "323";
        int m = 3;
        int n = 7;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (str1.charAt(i + j) != str2.charAt(j))
                    break;
            if (j == m)
                System.out.println(i);
        }
    }
}
