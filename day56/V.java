package 刷题;

public class V {
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        int dif=leftHeight-rightHeight;
        if(dif<-1||dif>1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }
}
