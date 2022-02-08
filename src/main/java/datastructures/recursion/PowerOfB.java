package datastructures.recursion;

public class PowerOfB {
    public static void main(String[] args) {
        System.out.println(pow(3,3));
    }

    static int pow(int B, int P) {
        if(P<=0) return 1;
        return B*pow(B,P-1);
    }
}
