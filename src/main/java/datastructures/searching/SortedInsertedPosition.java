package datastructures.searching;

public class SortedInsertedPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    static int searchInsert(int[] A, int B) {
        int start = 0, end = A.length-1;
        if( A[0] >= B)
        {
            return 0;
        }
        if( A[end] < B )
            return end + 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(A[mid] == B)
                return mid;
            if(A[ mid ] < B )
            {
                if( start == end )
                {
                    return mid+1;
                }
                start = mid+1;
            }
            if(A[ mid ] > B )
            {
                if( start == end )
                {
                    return mid-1;
                }
                end = mid - 1;
            }
        }
        return start;
    }
}
