package datastructures.recursion;

import java.util.Scanner;

public class PrintNDecreasing {
    //    public static void main(String[] args) {
//        //print(5);
//        System.out.println(printAndAdd(5));
//        System.out.println(printAndAddTailCall(5, 0));
//
//    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    static void print(int n) {
        if (n <= 0) return;
        System.out.println(n);
        print(n - 1);
    }

    static int printAndAdd(int n) {
        if (n <= 0) return 0;
        System.out.println(n);
        return n + printAndAdd(n - 1);
    }

    static int printAndAddTailCall(int n, int sum) {
        if (n <= 0) return sum;
        System.out.println(n);
        return printAndAddTailCall(n - 1, sum + n);
    }
}
