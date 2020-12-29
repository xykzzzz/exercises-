package offer;

public class Q {
/*    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null){
            return false;
        }
        if(isSameTree(root1,root2)){
            return true;
        }
        if(HasSubtree(root1.left,root2)){
            return true;
        }
        return HasSubtree(root1.right,root2);

    }
    public boolean isSameTree(TreeNode s, TreeNode p){
        if(s==null&&p==null){
            return true;
        }
        if(s==null||p==null){
            return false;
        }
        return s.val==p.val&&isSameTree(s.left,p.left)&&isSameTree(s.right,p.right);
    }*/
    public boolean isSameTree(TreeNode s,TreeNode p){
        if(p==null){
            return true;
        }
        if(s==null){
            return false;
        }
        return s.val==p.val&&isSameTree(s.left,p.left)&&isSameTree(s.right,p.right);
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2){
        if(root1==null||root2==null){
            return false;
        }
        if(isSameTree(root1,root2)){
            return true;
        }
        if(HasSubtree(root1.left,root2)){
            return true;
        }
        return HasSubtree(root1.right,root2);
    }
}
