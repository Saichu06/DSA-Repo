class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Double> ans=new ArrayList<>();

        while(queue.peek()!=null){
            int nodes=0;
            double sum=0.0;
            while(queue.peek()!=null){
                TreeNode node=queue.poll();
                sum+=node.val;
                nodes++;

                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            queue.add(queue.poll());
            ans.add((sum)/nodes);
        }

        return ans;
    }
}