/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class toSumTree {
    public void toSumTree(Node root) {
        helper(root);
    }
    
    public int helper(Node root) {
        if (root == null) {
            return 0;
        }
        int oldValue = root.data;
        int leftsum = helper(root.left);
        int rightsum = helper(root.right);
        root.data = leftsum + rightsum;
        return root.data + oldValue;
    }
}