package 测树;

import java.util.ArrayList;
import java.util.List;

public class L {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inOrderList=arrTOList(inorder);
        List<Integer> postOrderList=arrTOList(postorder);
        return buildTreeInternal(postOrderList,inOrderList);
    }

    private TreeNode buildTreeInternal(List<Integer> post, List<Integer> in) {
        if(post.isEmpty()){
            return null;
        }
        int rootValue = post.get(post.size() - 1);
        TreeNode root=new TreeNode(rootValue);
        if(post.size()==1){
            return root;
        }
        int i = in.indexOf(rootValue);
        List<Integer> inLeft = in.subList(0, i);
        List<Integer> inRight = in.subList(i + 1, in.size());
        List<Integer> postLeft = post.subList(0, i);
        List<Integer> postRight = post.subList(i, post.size() - 1);
        root.left=buildTreeInternal(postLeft,inLeft);
        root.right=buildTreeInternal(postRight,inRight);
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
