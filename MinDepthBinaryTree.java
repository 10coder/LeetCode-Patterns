//https://leetcode.com/problems/minimum-depth-of-binary-tree/
import java.util.LinkedList;
import java.util.Queue;

public class MinDepthBinaryTree {

    public int minDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }
        int min=Integer.MAX_VALUE;
        //return findDFSDep(root,0,min);
        return findBFSDep(root);
    }


    //Using BFS at every level check if there is leaf node and return level if present
    public int findBFSDep(TreeNode node) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);
        int level=1,lvlsize=1;
        while(!q.isEmpty()) {
            lvlsize=q.size();
            for(int i=0;i<lvlsize;i++) {
                TreeNode n=q.poll();
                if(n.left==null && n.right==null) {
                    return level;
                }
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            level++;
        }
        return 0;
    }

    //Using DFS to find leaf node with min value;
    public int findDFSDep(TreeNode n, int level,int min) {
        if(n!=null) {
            level++;
            if(n.left==null && n.right==null && level<min) {
                //if(level<min)
                min=level;
                return min;
            } else {
                if(n.left==null) {
                    return findDFSDep(n.right,level,min);
                }
                if(n.right==null) {
                    return findDFSDep(n.left,level,min);
                }
                return Math.min(findDFSDep(n.left,level,min),findDFSDep(n.right,level,min));
            }
        }
        return level;
    }

}
