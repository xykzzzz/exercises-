package 测树;

public class N {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q){
            return root;
        }
        boolean pLeft=search(root.left,p);
        boolean qLeft=search(root.left,q);
        if(pLeft&&qLeft){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(!pLeft&&!qLeft){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }

    private boolean search(TreeNode root, TreeNode t) {
        if(root==null){
            return false;
        }
        if(root==t){
            return true;
        }
        if(search(root.left,t)){
            return true;
        }
        return search(root.right,t);
    }
}
