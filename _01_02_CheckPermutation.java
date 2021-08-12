import java.util.Arrays;

/**
 * @authour winner
 * @Date 2021/8/12 22:12
 */
public class _01_02_CheckPermutation {
    public static boolean CheckPermutation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(_01_02_CheckPermutation.CheckPermutation("abc", "cba"));
    }
}
