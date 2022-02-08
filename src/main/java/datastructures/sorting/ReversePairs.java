package datastructures.sorting;

public class ReversePairs {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2000000000, 2000000000, -2000000000}));
    }


    public static int solve(int[] A) {
        int n = A.length;
        solve(A, 0, n - 1);
        return count;
    }

    static void solve(int[] A, int i, int j) {
        if (i == j) return;
        int mid = (i + j) / 2;

        solve(A, i, mid);
        solve(A, mid + 1, j);
        merge(A, i, mid, j);
    }

    static void merge(int[] A, int l, int m, int r) {
        int n1 = m-l+1;
        int n2 = r-m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i<n1; i++) {
            L[i] = A[l+i];
        }
        for(int i=0; i<n2; i++) {
            R[i] = A[m+1+i];
        }

        int i = 0, j = 0;
        while(i<n1 && j<n2) {
            long left = L[i];
            long right = R[j];
            if(left > 2*right) {
                count += (n1-i);
                j++;
            } else {
                i++;
            }
        }

        i = 0; j = 0;
        int k = l;
        while(i<n1 && j<n2) {
            if (L[i] > R[j]) {
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
            // count++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

//    public static int solve(int[] A) {
//        int n = A.length;
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if ((A[i]/2) > A[j]) {
//                    count++;
//
//                }
//            }
//        }
//        return count;
//    }
}
