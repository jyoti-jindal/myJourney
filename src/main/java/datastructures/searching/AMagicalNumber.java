package datastructures.searching;

public class AMagicalNumber {
    public static void main(String[] args) {
        System.out.println(solve(807414236, 3788, 38141));
    }
    static public int solve(int A, int B, int C) {
        long l = Math.min(B, C);
        long r = 1l * Math.min(B, C) * A;
        int lcm = lcm(B,C);
        int MOD = 1000000007;
        // System.out.println("lcm: " +lcm);
        while(l<=r) {
            long mid = l + (r-l)/2l;
            long data = ((mid/(1l*B)) + ((mid/(1l * C)) - (mid/(1l *lcm))));
            // System.out.println("data: " +data);
            if((data == 1l*A) && (mid%B==0 || mid%C == 0)) {
                System.out.println("data: " +data);
                return (int)(mid%MOD);
            }

            if(data>=A) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }

    // Recursive method to return gcd of a and b
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // method to return LCM of two numbers
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

}
