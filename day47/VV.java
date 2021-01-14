package offer;

import java.util.ArrayList;
import java.util.List;

public class VV {
    static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    private static List<TreeLinkNode> list=new ArrayList<>();
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        TreeLinkNode cur=pNode;
        while (cur.next!=null){
            cur=cur.next;
        }
        inOrder(cur);
        for (int i = 0; i < list.size(); i++) {
            if(pNode==list.get(i)){
               return i==list.size()-1?null: list.get(i+1);
            }
        }
        return null;
    }

    private void inOrder(TreeLinkNode root) {
        if(root!=null){
            inOrder(root.left);
            list.add(root);
            inOrder(root.right);
        }
    }
}
