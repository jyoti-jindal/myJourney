package datastructures.searching.binarysearch;

/**
 * 2. Find element in reverse sorted array (Descending)
 */
public class ReversedSortedArrayBinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 10));
    }

    static int binarySearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                return mid;
            }

            if (arr[mid] > k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
