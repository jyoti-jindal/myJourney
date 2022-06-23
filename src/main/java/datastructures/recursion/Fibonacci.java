package datastructures.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Starting");
        System.out.println(fib(100));
        System.out.println("Ending");
    }

    static int fib(int n) {
        if (n <= 1) return 0;
        if (n == 2) return 1;

        return fib(n - 1) + fib(n - 2);
    }
}
