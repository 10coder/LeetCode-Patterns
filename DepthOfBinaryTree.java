public class DepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return dfs(root,0);
    }

    public int dfs(TreeNode root, int depth) {
        if(root!=null) {
            depth++;
            return Math.max(dfs(root.left,depth),dfs(root.right,depth));
        }
        return depth;
    }

}
