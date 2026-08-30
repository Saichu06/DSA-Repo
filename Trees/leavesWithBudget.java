import java.util.ArrayList;
import java.util.Collections;

public class leavesWithBudget {
    class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
    public void dfs(Node root , int level , ArrayList<Integer> depth){
        if(root==null){
            return;
        }
        
        if(root.left==null && root.right==null){
            depth.add(level);
        }
        
        dfs(root.left,level+1,depth);
        dfs(root.right,level+1,depth);
    }
    
    public int getCount(Node node, int k) {
        ArrayList<Integer> depth = new ArrayList<>();
        dfs(node,1,depth);
        int count=0;
        int sum=0;
        Collections.sort(depth);
        for(int d : depth){
            if(sum+d<=k){
                sum+=d;
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
