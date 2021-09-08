import java.util.ArrayList;
import java.util.List;

public class _08_09_GenerateParenthesis {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {

        backtrack(n, 0, 0, "");
        return res;
    }

    private void backtrack(int n ,int leftNum, int rightNum, String s){
        if(s.length() == n * 2 && leftNum == rightNum){
            res.add(s);
            return;
        }

        if(leftNum > n || rightNum > n){
            return;
        }

        if(rightNum > leftNum){
            return;
        }

        backtrack(n, leftNum + 1, rightNum, s + "(");
        backtrack(n, leftNum, rightNum + 1, s + ")");
    }
}
