//https://leetcode.com/problems/path-sum/
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root,targetSum,0);
    }

    public boolean pathSum(TreeNode root,int targetSum, int sum) {
        if(root!=null) {
            sum+=root.val;
            if(root.left==null && root.right==null && sum==targetSum) {
                return true;
            }
            return pathSum(root.left,targetSum,sum) || pathSum(root.right, targetSum, sum);
        }
        return false;
    }
}
