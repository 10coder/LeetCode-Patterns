//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/submissions/
public class FindCommonAnscestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //stores the common anscestor
        TreeNode ans=new TreeNode();
        findAncestor(root,p,q,ans);
        return ans;
    }

    //Traverse the tree through dfs
    // if the current node has either value check for children if they have other value if value found in either children or in this node this node is the ancestor

    public boolean findAncestor(TreeNode r, TreeNode p, TreeNode q,TreeNode ans) {
        if(r!=null) {
            //check if this node has value
            boolean centre=(r.val==p.val || r.val==q.val);
            //check if one value is found in left subtree
            boolean left=findAncestor(r.left,p,q,ans);
            //check if one value is found in right subtree
            boolean right=findAncestor(r.right,p,q,ans);

            //if value found in either of 3 combinations set answer with this root value this condition is true only if this is the least common anscestor
            if((centre && left) || (centre && right) || (left && right))
                ans.val=r.val;
            return (left || right || centre);
        }
        return false;
    }
}
