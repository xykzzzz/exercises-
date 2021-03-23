package 测树;

import java.util.ArrayList;
import java.util.List;

public class K {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preOrderList=arrTOList(preorder);
        List<Integer> inOrderList=arrTOList(inorder);
        return buildTreeInternal(preOrderList,inOrderList);
    }

    private TreeNode buildTreeInternal(List<Integer> pre, List<Integer> in) {
        if(pre.isEmpty()){
            return null;
        }
        int rootValue = pre.get(0);
        TreeNode root=new TreeNode(rootValue);
        if(pre.size()==1){
            return root;
        }
        int i = in.indexOf(rootValue);
        List<Integer> preLeftList = pre.subList(1, 1+i);
        List<Integer> preRightList = pre.subList(i+1, pre.size());
        List<Integer> inLeftList = in.subList(0, i);
        List<Integer> inRightList = in.subList(i + 1, in.size());
        root.left=buildTreeInternal(preLeftList,inLeftList);
        root.right=buildTreeInternal(preRightList,inRightList);
        return root;
    }

    private List<Integer> arrTOList(int[] temp) {
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i <temp.length ; i++) {
            list.add(temp[i]);
        }
        return list;
    }
}
