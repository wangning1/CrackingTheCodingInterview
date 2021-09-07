import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _08_08_permutation_ii {

    List<List<Character>> res;
    boolean[] used;

    public String[] permutation(String S) {
        res = new ArrayList<>();
        if (S == null || S.isEmpty()) {
            return new String[]{};
        }
        used = new boolean[S.length()];
        char[] chars = S.toCharArray();
        Arrays.sort(chars);
        backtrack(chars, used, new LinkedList<>());
        String[] result = new String[res.size()];
        int i = 0;
        for (List<Character> list : res) {
            StringBuilder sb = new StringBuilder();
            for (Character character : list){
                sb.append(character);
            }
            result[i] = sb.toString();
            i++;
        }
        return result;
    }

    private void backtrack(char[] chars, boolean[] used, LinkedList<Character> path) {
        if (path.size() == chars.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) {
                continue;
            }

            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            path.add(chars[i]);
            backtrack(chars, used, path);
            path.removeLast();
            used[i] = false;
        }
    }
}
