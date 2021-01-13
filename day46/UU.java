package offer;

import java.util.ArrayList;
import java.util.List;

public class UU {
    private List<TreeNode> list=new ArrayList<>();
    TreeNode KthNode(TreeNode pRoot, int k) {
        middleSearch(pRoot);
        if(k>=1&&list.size()>=k){
            return list.get(k-1);
        }
        return null;
    }

    private void middleSearch(TreeNode pRoot) {
        if(pRoot!=null){
            middleSearch(pRoot.left);
            list.add(pRoot);
            middleSearch(pRoot.right);
        }
    }
}
