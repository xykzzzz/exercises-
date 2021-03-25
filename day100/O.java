package 测树;

import java.util.Deque;
import java.util.LinkedList;

public class O {
    void preOrderTraversal(TreeNode root){
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode cur=root;
        while (!stack.isEmpty()||cur!=null){
            while (cur!=null){
                System.out.println(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top = stack.peek();
            cur=top.right;
        }
    }
    void InOrderTraversal(TreeNode root){
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode cur=root;
        while (!stack.isEmpty()||cur!=null){
            while (cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top = stack.peek();
            System.out.println(cur.val);
            cur=top.right;
        }
    }
}
