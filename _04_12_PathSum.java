import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _04_12_PathSum {
    List<List<Integer>> res = new ArrayList<>();

    public int pathSum(TreeNode root, int sum) {
        inOrder(root, sum);
        System.out.println(res);
        return res.size();
    }

    private void inOrder(TreeNode node, int sum) {
        if (node == null) {
            return;
        }
        inOrder(node.left, sum);
        doPathDFS(node, sum, new LinkedList<>());
        inOrder(node.right, sum);
    }

    public void doPathDFS(TreeNode node, int num, LinkedList<Integer> path) {
        if (node == null) {
            return;
        }
        path.addLast(node.val);
        if (num - node.val == 0) {
            res.add(new LinkedList<>(path));
        }
        doPathDFS(node.left, num - node.val, path);
        doPathDFS(node.right, num - node.val, path);
        path.removeLast();
    }
}
