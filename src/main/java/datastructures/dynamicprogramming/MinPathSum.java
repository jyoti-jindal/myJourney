package datastructures.dynamicprogramming;

public class MinPathSum {
    public static void main(String[] args) {
        MinPathSum minPathSum = new MinPathSum();
        System.out.println(minPathSum.minPathSum(new int[][]{{1, -3, 2},
                {2, 5, 10},
                {5, -5, 1}}));
    }

    public int minPathSum(int[][] A) {
        return minPathSum(A, A.length - 1, A[0].length - 1);
    }

    public int minPathSum(int[][] A, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (i == 0 && j == 0) {
            return 0;
        }

        int down = A[i][j] + minPathSum(A, i - 1, j);
        int right = A[i][j] + minPathSum(A, i, j - 1);

        return A[i][j] + Math.min(down, right);
    }
}
// i=2, j=2 A[i][j] =1
// i=1, j=2 A[i][j] = 10
// i=0, j=2 A[i][j] = 2