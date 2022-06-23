package datastructures.dynamicprogramming;

public class PalindromicPartition {
    static int ans = 0;

    public static void main(String[] args) {
        PalindromicPartition palindromicPartition = new PalindromicPartition();
        String text = "aabaee";
        ans = text.length() - 1;
        System.out.println(palindromicPartition.palindromePartition(text, 0) - 1);
    }

    int palindromePartition(String text, int s) {
        if (s == text.length()) {
            return 0;
        }

        for (int i = s; i < text.length(); i++) {
            String subString = text.substring(s, i + 1);
            if (isPalindrome(subString)) {
                ans = Math.min(palindromePartition(text, i + 1) + 1, ans);
                return ans;
            }
        }
        return text.length() - 1;
    }

    boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        if (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }


}
