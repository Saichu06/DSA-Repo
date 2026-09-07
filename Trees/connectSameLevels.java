import java.util.LinkedList;
import java.util.Queue;

public class connectSameLevels {
    class Node {
        int data;
        Node left;
        Node right;
        Node nextRight;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
            nextRight = null;
        }
    }

    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (i == size - 1) {
                    node.nextRight = null;
                } else {
                    node.nextRight = q.peek();
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return root;
    }
}
