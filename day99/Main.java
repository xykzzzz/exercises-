package 测树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> in=new ArrayList<>();
            int levelSize=queue.size();
            for(int i=1;i<=levelSize;i++){
                TreeNode node = queue.poll();
                in.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            list.add(in);
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root=Build.buildTree();
        List<List<Integer>> list = levelOrder(root);
        System.out.println(list);
    }
}
