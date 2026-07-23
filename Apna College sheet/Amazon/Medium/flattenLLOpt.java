class flattenLLOpt {
    // Definition for a binary tree node.
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


    public void flatten(TreeNode root) {
        System.
        while (root != null) {
            if (root.left != null) {
                TreeNode curr = root.left;
                while (curr.right != null) {
                    curr = curr.right;
                }
                curr.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}