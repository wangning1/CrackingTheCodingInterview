public class _04_05_ValidBST {
    public boolean isValidBST(TreeNode root) {
        return validNode(root, null, null);
    }

    public boolean validNode(TreeNode node, Integer min, Integer max) {
        if (node == null) {
            return true;
        }

        if (min != null && min >= node.val) {
            return false;
        }

        if (max != null && max <= node.val) {
            return false;
        }

        return validNode(node.left, min, node.val) &&
                validNode(node.right, node.val, max);
    }
}
