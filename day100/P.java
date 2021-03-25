package 测树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class P {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Deque<TreeNode> stack=new LinkedList<>();
        TreeNode cur=root;
        while (!stack.isEmpty()||cur!=null){
            while (cur!=null){
                list.add(cur.val);
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode top = stack.pop();
            cur=top.right;
        }
        return list;
    }
}
