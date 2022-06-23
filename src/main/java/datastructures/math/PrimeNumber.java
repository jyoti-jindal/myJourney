package datastructures.math;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if (isPrime(A)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }

    static boolean isPrime(int A) {
        if (A == 2) {
            return true;
        }
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                //System.out.println(A + " is divisible by " +i);
                return false;
            }
        }
        return true;
    }
}
