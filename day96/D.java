package 测树;

public class D {
    //给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    //镜像树
    public boolean isMirrorTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val==q.val&&isMirrorTree(p.left,q.right)&&isMirrorTree(p.right, q.left);
    }
}
