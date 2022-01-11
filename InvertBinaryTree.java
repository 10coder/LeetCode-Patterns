//https://leetcode.com/problems/invert-binary-tree/submissions/
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        TreeNode head=root;
        if(root!=null){
            inverse(root);
        }
        return head;
    }

    public void inverse(TreeNode root) {
        if(root!=null) {
            TreeNode t=root.left;
            root.left=root.right;
            root.right=t;
            inverse(root.left);
            inverse(root.right);
        }
    }
}
