public class _04_02_SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return doBuildTree(nums, 0, nums.length - 1);
    }

    private TreeNode doBuildTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = doBuildTree(nums, start, mid - 1);
        node.right = doBuildTree(nums, mid + 1, end);
        return node;
    }

}
