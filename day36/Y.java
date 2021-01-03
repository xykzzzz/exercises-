package offer;

public class Y {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else if(root.left==null&&root.right==null){
            return 1;
        }else{
            int leftHeight=TreeDepth(root.left);
            int rightHeight=TreeDepth(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }
}
