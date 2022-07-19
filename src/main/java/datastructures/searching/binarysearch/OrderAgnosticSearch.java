package datastructures.searching.binarysearch;

public class OrderAgnosticSearch {
    public static void main(String[] args) {
        System.out.println(orderAgnosticSearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 1));
        System.out.println(orderAgnosticSearch(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 10));
    }

    static int orderAgnosticSearch(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == k) {
                return mid;
            }

            if (mid>0 && arr[mid] > arr[mid - 1]) { // ascending
                if (arr[mid] > k) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else { // descending
                if (arr[mid] > k) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
