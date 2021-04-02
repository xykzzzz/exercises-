package 测树;


import java.util.Deque;
import java.util.LinkedList;

public class Q {
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root==null){
//            return false;
//        }
//        if(root.left==null&&root.right==null){
//            return targetSum==root.val;
//        }
//        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum-root.val);
//    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Deque<TreeNode> nodeDeque=new LinkedList<>();
        Deque<Integer> valDeque=new LinkedList<>();
        nodeDeque.offer(root);
        valDeque.offer(root.val);
        while (!nodeDeque.isEmpty()){
            TreeNode now = nodeDeque.poll();
            int nowVal = valDeque.poll();
            if(now.left==null&&now.right==null){
                if(targetSum==nowVal){
                    return true;
                }
                continue;
            }
            if(now.left!=null){
                nodeDeque.offer(now.left);
                valDeque.offer(now.left.val+nowVal);
            }
            if(now.right!=null){
                nodeDeque.offer(now.right);
                valDeque.offer(now.right.val+nowVal);
            }
        }
        return false;
    }
}
