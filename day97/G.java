package 测树;

public class G {
    //二叉树的高度
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right==null){
            return 1;
        }else {
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
