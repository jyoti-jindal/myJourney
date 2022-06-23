package datastructures.searching.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{0,1,2,3,9,10,25,30,35}, 60));
    }

    static int binarySearch(int A[], int target) {
        int l =0 , r= A.length-1;
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(A[mid]==target) {
                return mid;
            }

            if(A[mid]>target) {
                r = mid-1;
            } else {
                l =mid+1;
            }
        }
        return -1;
    }
}
