
//   Definition for a binary tree node.

import java.util.*;

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

class maxLevelSum {
    public int maxLevelSum(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int level = 1;
        int maxLevel = 1;
        int maxSum = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int currLevelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                currLevelSum += currNode.val;

                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }

            if (currLevelSum > maxSum) {
                maxSum = currLevelSum;
                maxLevel = level;
            }

            level++;
        }

        return maxLevel;
    }
}