import javax.swing.tree.TreeNode;

public class kthSmallestinBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int count = 0;
    int result = 1;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return result;
    }

    public void helper(TreeNode root, int k) {
        if (root == null)
            return;
        helper(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }
        helper(root.right, k);
    }
}
