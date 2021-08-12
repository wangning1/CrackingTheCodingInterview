/**
 * @authour winner
 * @Date 2021/8/12 23:03
 */
public class _01_04_CanPermutePalindrome {
    public static boolean canPermutePalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        long highBitMap = 0;
        long lowBitMap = 0;
        for (char c : s.toCharArray()) {
            if (c >= 64) {
                highBitMap ^= 1L << c - 64;
            } else {
                lowBitMap ^= 1L << c;
            }
        }

        return Long.bitCount(highBitMap) + Long.bitCount(lowBitMap) <= 1;
    }

    public static void main(String[] args) {
        System.out.println(_01_04_CanPermutePalindrome.canPermutePalindrome("tactcoa"));
    }
}
