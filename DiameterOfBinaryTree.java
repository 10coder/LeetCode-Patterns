//https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBinaryTree {
    //Intially I thought adding left depth and right depth at root would solve as always root adds more diameter
    // but for the case where root diameter formed at root can be less than diameter formed at subtree having same depth, hence maintain a global maxDiameter variable to update maxDia every time and return depth
    int maxDia=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int maxDep=0;
        int leftDep=dfs(root.left);
        int rightDep=dfs(root.right);
        maxDia=Math.max(leftDep+rightDep,maxDia);
        return maxDia;
    }

    public int dfs(TreeNode root) {
        if(root!=null) {
            if(root.left==null && root.right==null) {
                return 1;
            }
            int leftDep =dfs(root.left);
            int rightDep=dfs(root.right);
            //finding max dep out of both children
            int dep =1+Math.max(leftDep,rightDep);
            //calculating diameter formed at this node
            int dia=leftDep+rightDep;
            //updating if this is maxDiameter
            maxDia=Math.max(dia,maxDia);
            return dep;
        }
        return 0;
    }
}
