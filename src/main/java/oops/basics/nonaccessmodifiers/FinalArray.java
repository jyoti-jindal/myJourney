package oops.basics.nonaccessmodifiers;

public class FinalArray {
    public static void main(String[] args) {
        int[] A = solve(new int[]{1, 2, 3, 4, 5});
        for (int i : A) {
            System.out.println(i + " ");
        }
    }// values can be changed but cannot be initialised again.

    public static int[] solve(final int[] A) {
        int n = A.length;
//        A = new int[n];
//        int[] res = new int[];
        for (int i = 0; i < n / 2; i++) {
            int temp = A[i];
            A[i] = A[n - i - 1];
            A[n - i - 1] = temp;
        }
        return A;
    }
}
