package datastructures.backtracking;

public class UniquePath {
    static int n, m;

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{
                {1, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 2, -1}
        }));
    }

    public static int solve(int[][] A) {
        n = A.length;
        int startx = -1, starty = -1;
        int countNO = 0;
        for (int i = 0; i < n; i++) {
            m = A[i].length;
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 1) {
                    startx = i;
                    starty = j;
                } else if (A[i][j] == 0) {
                    countNO++;
                }
            }
        }
        return uniquePaths(startx, starty, countNO, A);
    }

    public static int uniquePaths(int x, int y, int count, int[][] A) {
        if (x < 0 || x > n - 1 || y < 0 || y > m - 1 || A[x][y] == -1 || count < 0) {
            return 0;
        }

        if (A[x][y] == 2 && count == 0) {
            return 1;
        }


        return uniquePaths(x + 1, y, count - 1, A) +
                uniquePaths(x - 1, y, count - 1, A) +
                uniquePaths(x, y + 1, count - 1, A) +
                uniquePaths(x, y - 1, count - 1, A);
    }
}
