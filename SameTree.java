//https://leetcode.com/problems/same-tree/
public class SameTree {
    //Check at every level through DFS having same value and same structure
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) {
            return true;
        }
        if(p!=null && q!=null) {
            if(p.val==q.val) {
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }
        }
        return false;
    }
}
