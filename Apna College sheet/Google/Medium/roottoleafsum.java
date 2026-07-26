import javax.swing.tree.TreeNode;

public class roottoleafsum {

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

    public int sumNumbers(TreeNode root) {
        return nodeSum(root, 0);
    }

    public int nodeSum(TreeNode root, int currSum) {
        if (root == null)
            return 0;
        currSum = currSum * 10 + root.val;
        if (root.left == null && root.right == null)
            return currSum;
        int leftSum = nodeSum(root.left, currSum);
        int rightSum = nodeSum(root.right, currSum);
        return leftSum + rightSum;
    }
}
