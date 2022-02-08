package datastructures.recursion;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr, n-1));
    }

    public static int maxOfArray(int[] arr, int idx) {
        if(idx<=0) {
            return arr[idx];
        }
        int max = maxOfArray(arr, idx-1);
        if(max < arr[idx]) {
            return arr[idx];
        } else {
            return max;
        }
    }
}
