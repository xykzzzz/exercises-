package offer;

public class FF {
    //平衡二叉树
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        int dif=leftHeight-rightHeight;
        if(!(dif==1||dif==0||dif==-1)){
            return false;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
}
