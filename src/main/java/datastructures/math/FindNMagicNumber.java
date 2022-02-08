package datastructures.math;

public class FindNMagicNumber {
    public static void main(String[] args) {
        System.out.println(solve(3));
    }

    static public int solve(int A) {
        int[] res = new int[A];
        res[0] = 5;
        int start = 1;
        int p = 2;
        while (start < A) {
            res[start] = (int) Math.pow(5, p++);
            int end = start;
            start++;
            int i = 0;
            while (start < A && i < end) {
                res[start] = res[end] + res[i];
                start++;
                i++;
            }
        }
        return res[A - 1];
    }
}
