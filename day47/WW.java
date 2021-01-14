package offer;

public class WW {
    boolean isSymmetrical(TreeNode pRoot) {
        if(pRoot==null){
            return true;
        }
        return isMirrorTree(pRoot.left,pRoot.right);
    }

    private boolean isMirrorTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return (p.val==q.val)&&isMirrorTree(p.left,q.right)&&isMirrorTree(p.right,q.left);
    }
}
