package datastructures.string;

public class ReplaceStars {
    public static void main(String[] args) {
        System.out.println(plusMinus(5, 14, "5*9*0"));
    }

    public static String plusMinus(int N, int K, String S) {
        char[] ch = S.toCharArray();
        int sum = ch[0]-48;
        for(int i=2; i<N; i+=2) {
            int temp = sum + ch[i]-48;
            if(temp > K) {
                ch[i-1] = '-';
                sum -= (ch[i]-48);
            } else {
                ch[i-1] = '+';
                sum += (ch[i]-48);
            }
        }
        return  new String(ch);
    }
}
