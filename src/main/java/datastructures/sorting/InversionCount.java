package datastructures.sorting;

public class InversionCount {
    static int count = 0;

    public static void main(String[] args) {
        solve(new int[]{45, 10, 15, 25, 50});
    }
    static public int solve(int[] A) {

        int n = A.length;
        sort(A, 0, n - 1);
        return count;
    }


    static void sort(int[] A, int i, int j) {
        if (i == j) return;

        int mid = (i + j) / 2;

        sort(A, i, mid);
        sort(A, mid + 1, j);
        merge(A, i, mid, j);
    }

    static void merge(int[] A, int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = A[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] > R[j]) {
                //count++;
                A[k++] = R[j++];
            } else {
                A[k++] = L[i++];
            }
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
            count++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
}
