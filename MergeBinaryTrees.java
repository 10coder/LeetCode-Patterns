public class MergeBinaryTrees {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        //assign non null root to head
        TreeNode head=root1!=null?root1:root2;
        //if either root is null skip merging
        if(root1!=null && root2!=null)
            merge(root1,root2);
        return head;
    }

    public void merge(TreeNode root1, TreeNode root2) {
        //nothing to merge
        if(root1==null && root2==null) {
            return;
        }
        //merge both
        if(root1!=null && root2!=null) {
            root1.val+=root2.val;
        }

        //if both have left values merge them otherwise assign non null value to the left branch
        if(root1.left!=null && root2.left!=null) {
            merge(root1.left,root2.left);
        }
        //if root1 left is null assign root1 left
        if(root1.left==null) {
            root1.left=root2.left;
        }

        //if both have right values merge them otherwise assign non null value to the right branch
        if(root1.right!=null && root2.right!=null) {
            merge(root1.right,root2.right);
        }
        if(root1.right==null) {
            root1.right=root2.right;
        }

    }
}
