package GFG.Oracle;

import org.w3c.dom.Node;

public class hasPathSum {
    boolean hasPathSum(Node root, int target) {

        if(root == null) {
            return false;
        }

        int subSum = target - root.data;

        // Leaf node
        if(subSum == 0 && root.left == null && root.right == null) {
            return true;
        }

        boolean left = false;
        boolean right = false;

        if(root.left != null) {
            left = hasPathSum(root.left, subSum);
        }

        if(root.right != null) {
            right = hasPathSum(root.right, subSum);
        }

        return left || right;
    }
}
