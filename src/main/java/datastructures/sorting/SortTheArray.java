package datastructures.sorting;

import java.util.Arrays;

public class SortTheArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}));
    }

    public static int solve(int[] A) {
        int N = A.length;

        int l = 0;
        int r = N - 1;

        for (l = 0; l < N - 1; l++)
        {
            if (A[l] > A[l + 1])
                break;
        } // 3

        if (l == N - 1){
            return 0;
        }


        for(r = N - 1; r > 0; r--)
        {
            if(A[r] < A[r - 1])
                break;
        } // 7


        int mx = A[l];
        int mn = A[l];

        for(int i = l + 1; i <= r; i++)
        {
            if(A[i] > mx)
                mx = A[i];
            if(A[i] < mn)
                mn = A[i];
        }


        for(int i = 0; i < l; i++)
        {
            if(A[i] > mn)
            {
                l = i;
                break;
            }
        }

        for(int i = N - 1; i >= r + 1; i--)
        {
            if(A[i] < mx)
            {
                r = i;
                break;
            }
        }

        return r - l + 1;
    }

//    public static int solve(int[] A) {
//        int n = A.length;
//        int[] temp = new int[n];
//        for(int i=0; i<n; i++) {
//            temp[i] = A[i];
//        }
//
//        Arrays.sort(A);
//
//        int count = 0;
//        for(int i=0; i<n; i++) {
//            if(A[i]!=temp[i]) {
//                count++;
//            }
//        }
//
//        return count;
//    }
}
