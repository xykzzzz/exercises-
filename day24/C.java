package offer;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class C {
    //[1,2,3,4,5,6,7],[3,2,4,1,6,5,7]
    //{1,2,5,3,4,6,7}
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preList=arrTOList(pre);
        List<Integer> inList=arrTOList(in);
        return buildTreeInternal(preList,inList);
    }

    private TreeNode buildTreeInternal(List<Integer> preList, List<Integer> inList) {
        if(preList.isEmpty()){
            return null;
        }
        int rootVal=preList.get(0);
        TreeNode root=new TreeNode(rootVal);
        if(preList.size()==1){
            return root;
        }
        int leftSize=inList.indexOf(rootVal);
        //切割
        // 前序遍历左子树和右子树
        List<Integer> leftPre=preList.subList(1,1+leftSize);
        List<Integer> rightPre=preList.subList(1+leftSize,preList.size());
        //中序遍历的左子树和右子树
        List<Integer> leftIn=inList.subList(0,leftSize);
        List<Integer> rightIn = inList.subList(leftSize + 1, inList.size());
        //构造树
        root.left=buildTreeInternal(leftPre,leftIn);
        root.right=buildTreeInternal(rightPre,rightIn);
        return root;
    }


    private List<Integer> arrTOList(int[] arr) {
        List<Integer> list=new ArrayList<>();
        for (int x:arr) {
            list.add(x);
        }
        return list;
    }
}
