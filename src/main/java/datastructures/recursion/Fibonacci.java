package datastructures.recursion;

public class Fibonacci {
    public static void main(String[] args) {

    }

    int fib(int n) {
        if(n<=1) return 0;
        if(n==2) return 1;

        return fib(n-1) + fib(n-2);
    }
}
