package datastructures.twopointers;

public class SumPair {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 6, 6, 7, 9, 9}, 13));
    }

    public static int solve(int[] A, int B) {
        int n = A.length;
        int l=0, r=n-1;
        int MOD = 1000000007;
        int count= 0;
        while(l<n && r<n && l<r) {
            int x = A[l];
            int y = A[r];

            if(x+y == B) {
                //count = (count + 1)%MOD;
                int countl=0, countr=0;
                while(l<n && l<=r && A[l]==x) {
                    l++;
                    countl++;
                }
                while(r>=0 && r>=l && A[r]==y) {
                    r--;
                    countr++;
                }
                if(x==y) {
                    count = (count + (countl * (countl-1)/2)%MOD)%MOD;
                } else {
                    count = (count + (countl * countr)%MOD)%MOD;
                }
            } else if(x+y>B) {
                r--;
            } else {
                l++;
            }
        }
        return count;
    }
}
