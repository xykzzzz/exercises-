package 测树;

public class H {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftTreeHeight=getHeight(root.left);
        int rightTreeHeight=getHeight(root.right);
        int dif=leftTreeHeight-rightTreeHeight;
        if(!(dif==1||dif==-1||dif==0)){
            return false;
        }

        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private int getHeight(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
