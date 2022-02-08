package datastructures.twopointers;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{2 ,1, -9, -7, -8, 2 ,-8, 2, 3, -8}, -1));
    }

    public static int threeSumClosest(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int closestG = A[n-1]+A[n-2]+A[0];
        int closestS= A[0]+A[1]+A[2];
        for(int i=0; i<n; i++) {
            int l= i+1;
            int r = n-1;
            int data = B-A[i];
            while(l<r) {
                int sum = A[l] + A[r];
                if(sum == data) {
                    return B;
                } else if(sum > data) {
                    r--;
                    if(Math.abs(closestG-B)>Math.abs((sum+A[i])-B))
                        closestG = sum+A[i];
                } else {
                    l++;
                    if(Math.abs(B-closestS)>Math.abs(B-(sum+A[i])))
                        closestS = sum+A[i];
                }
            }
        }
        // if(closestG==Integer.MAX_VALUE) return closestS;
        // if(closestS==Integer.MAX_VALUE) return closestG;

        // System.out.println(closestG);
        // System.out.println(closestS);

        int ans1 = Math.abs(closestG-B);
        int ans2 = Math.abs(B-closestS);
        // System.out.println(ans1);
        // System.out.println(ans2);
        return ans1>ans2 ? closestS: closestG;
    }
}
