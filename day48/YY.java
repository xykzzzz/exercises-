package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class YY {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        int sum=1;
        int level=1;
        while (!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            while (sum>0) {
                TreeNode t = queue.poll();
                list.add(t.val);
                if(t.left!=null){
                    queue.add(t.left);
                }
                if(t.right!=null){
                    queue.add(t.right);
                }
                sum--;
            }
            sum = queue.size();
            level++;
            res.add(list);
        }
        return res;
    }
}
