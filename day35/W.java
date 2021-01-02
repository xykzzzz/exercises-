package offer;

import java.util.ArrayList;

public class W {
    //输入一颗二叉树的根节点和一个整数，按字典序打印出二叉树中结点值的和为输入整数的所有路径。
    // 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径
    //{10,5,12,4,7},22  [[10,5,7],[10,12]]
    //{10,5,12,4,7},15   []
    private ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    private static ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null){
            return res;
        }
        path.add(root.val);
        target=target-root.val;
        if(target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        path.remove(path.size() - 1);
        return res;
    }
}
