import java.util.*;

class cloneGraph {

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {

        if (node == null)
            return null;

        Map<Node, Node> map = new HashMap<>();

        Queue<Node> q = new LinkedList<>();

        Node head = new Node(node.val);

        map.put(node, head);

        q.add(node);

        while (!q.isEmpty()) {

            Node curr = q.poll();

            Node clone = map.get(curr);

            for (Node neighbor : curr.neighbors) {

                if (!map.containsKey(neighbor)) {

                    map.put(neighbor, new Node(neighbor.val));

                    q.add(neighbor);
                }

                clone.neighbors.add(map.get(neighbor));
            }
        }

        return head;
    }
}