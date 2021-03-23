package 测树;

import java.util.LinkedList;
import java.util.Queue;

public class J {
    public boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (true){
            TreeNode node = queue.remove();
            if(node==null){
                break;
            }
            queue.add(node.left);
            queue.add(node.right);
        }
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            if(node==null){

            }else {
                return false;
            }
        }
        return true;
    }
}
