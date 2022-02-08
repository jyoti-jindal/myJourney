package datastructures.twopointers;

public class CountRectangle {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{}, 12 ));
    }

    public static int solve(int[] A, int B) {
        int l=0, n = A.length;
        int r =n-1;
        int count =0;
        int MOD = 1000000007;
        while(l<=r) {

            if(A[l]<B && A[r]<B && A[l]*A[r]<B) {

                //int temp = r-l+1;
                count = (count + 2*(r - l) + 1)%MOD;
                // count = count + r;

                l++;
            }else {
                r--;
            }
        }
        return count;
    }
}
