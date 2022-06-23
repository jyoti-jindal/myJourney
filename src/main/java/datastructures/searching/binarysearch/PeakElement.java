package datastructures.searching.binarysearch;

public class PeakElement {
    public static void main(String[] args) {
        PeakElement peakElement = new PeakElement();
        System.out.println(peakElement.solve(new int[]{18, 33, 100, 135,
                203, 270, 292, 310, 356, 392, 400, 429, 436, 461, 427, 403, 399, 375, 251, 245, 173, 130, 43}));
    }

    public int solve(int[] A) {
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == 0 || mid == A.length - 1 || (A[mid] > A[mid - 1] && A[mid] > A[mid + 1])) {
                return A[mid];
            }

            if (A[mid] > A[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
