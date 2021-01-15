package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class XX {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        if(pRoot==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(pRoot);
        int level=1;
        int sum=1;
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            while (sum>0){
                TreeNode t=queue.poll();
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
            if(level%2 == 0){
                for(int i = 0,j = list.size() -1;i<j; i++,j--){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
            level++;
            res.add(list);
        }
        return res;
        }
    }