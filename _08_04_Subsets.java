import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _08_04_Subsets {
    List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 1; i < nums.length; i++) {
            backtrack(nums, 0, i, new LinkedList<>());
        }
        return res;
    }

    public void backtrack(int[] nums, int start, int count, LinkedList<Integer> path) {
        if (path.size() == count) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(nums, i + 1, count, path);
            path.removeLast();
        }
    }
}
