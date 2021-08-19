public class _04_06_InorderSuccessor {
    TreeNode successor = null;
    boolean next = false;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inOrder(root, p);
        return successor;
    }

    void inOrder(TreeNode node, TreeNode p) {
        if (node == null) {
            return;
        }
        inOrder(node.left, p);
        if (next) {
            successor = node;
            next = false;
        }

        if (node == p) {
            next = true;
        }

        inOrder(node.right, p);
    }
}
