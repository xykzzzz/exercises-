package 测树;

public class F {
    //二叉树的子树
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.val==q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        return search(s,t);
    }

    private boolean search(TreeNode root, TreeNode t) {
        if(root==null){
            return false;
        }
        if(root.val==t.val){
            if(isSameTree(root,t)){
                return true;
            }
        }
        if(search(root.left,t)){
            return true;
        }
        return search(root.right,t);
    }
}
