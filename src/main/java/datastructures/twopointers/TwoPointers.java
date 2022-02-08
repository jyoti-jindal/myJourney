package datastructures.twopointers;

public class TwoPointers {
    public static void main(String[] args) {
        solve(new int[]{1, 1000000000}, 1000000000);
    }
    public static int[] solve(int[] A, int B) {

        int n = A.length;
        long ps[] = new long[n+1];
        int start = -1, end = -1;
        for(int i=1; i<n+1; i++) {
            ps[i] = (ps[i-1] + A[i-1])%1000000007;
        }

        //HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        int l = 0, r=l+1;
        //int start = -1, end = -1;
        while(l<=n && r<=n && l<=r) {
            long diff = ps[r]-ps[l];
            if(diff == B) {
                start = l;
                end = r;
                break;
            } else if(diff>B) {
                l++;
            } else {
                r++;
            }
        }
        if(start == -1 && end == -1) return new int[] {start};


        int res[] = new int[end-start];
        for(int i=start; i<end; i++) {
            res[i-start] = A[i];
        }
        return res;
    }
}
