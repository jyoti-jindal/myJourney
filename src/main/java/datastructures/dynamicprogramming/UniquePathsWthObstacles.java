package datastructures.dynamicprogramming;

public class UniquePathsWthObstacles {

    public static void main(String[] args) {
        UniquePathsWthObstacles uniquePathsWthObstacles = new UniquePathsWthObstacles();
        System.out.println(uniquePathsWthObstacles.uniquePathsWithObstacles(new int[][]{{1, 0}}));
    }

    public int uniquePathsWithObstacles(int[][] A) {
        int x = A.length;
        int y = A[0].length;
        return uniquePathsWithObstacles(A, x - 1, y - 1);
    }


    public int uniquePathsWithObstacles(int[][] A, int x, int y) {


        if (x < 0 || y < 0) {
            return 0;
        }

        if (A[x][y] == 1) {
            return 0;
        }

        if (x == 0 && y == 0) {
            return 1;
        }

        return uniquePathsWithObstacles(A, x - 1, y) +
                uniquePathsWithObstacles(A, x, y - 1);

    }
}
