//https://leetcode.com/problems/average-of-levels-in-binary-tree/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsBT {

//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }

//We can use BFS having a count of level size with number of elements in the queue and travesing only till that cnt
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res  = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) {
            return res;
        }
        q.add(root);
        while(!q.isEmpty()) {
            int levelSize=q.size();
            double avg=0,cnt=0;
            for(int i=0;i<levelSize;i++) {
                TreeNode tn=q.poll();
                if(tn.left!=null) {
                    q.add(tn.left);
                }
                if(tn.right!=null) {
                    q.add(tn.right);
                }
                avg+=(double)(tn.val);
            }
            avg/=levelSize;
            res.add(avg);
        }
        return res;
    }
}
