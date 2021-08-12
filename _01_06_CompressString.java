/**
 * @authour winner
 * @Date 2021/8/12 22:29
 */
public class _01_06_CompressString {
    public static String compressString(String S) {
        if (S == null || S.isEmpty()) {
            return S;
        }

        StringBuilder sb = new StringBuilder();

        char[] chars = S.toCharArray();
        char tmp = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == tmp) {
                count++;
            } else {
                sb.append(tmp).append(count);
                count = 1;
            }
            tmp = chars[i];
        }

        sb.append(tmp).append(count);
        return sb.toString().length() >= S.length() ? S : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(_01_06_CompressString.compressString("abbccd"));
    }

}
