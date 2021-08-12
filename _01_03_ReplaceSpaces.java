/**
 * @authour winner
 * @Date 2021/8/12 22:20
 */
public class _01_03_ReplaceSpaces {
    public static String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        int i = 0;
        for (char c : chars) {
            if (i == length) {
                break;
            }
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(_01_03_ReplaceSpaces.replaceSpaces("               ", 5));
    }
}
