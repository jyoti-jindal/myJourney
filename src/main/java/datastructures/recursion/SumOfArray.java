package datastructures.recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(sumOfArray(A, 0));
    }
    static int sumOfArray(int[] A, int index) {
        if(index >= A.length) return 0;
        return A[index] + sumOfArray(A, index+1);
    }
}
