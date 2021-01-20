package 刷题;

public class Q {

 static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode bs=null;
        ListNode be=null;
        ListNode as=null;
        ListNode ae=null;
        ListNode cur=pHead;
        while (cur!=null){
            if(cur.val<x){
                if(bs==null){
                    bs=cur;
                    be=bs;
                }else {
                    be.next=cur;
                    be=cur;
                }
            }else {
                if(as==null){
                    as=cur;
                    ae=as;
                }else {
                    ae.next=cur;
                    ae=cur;
                }
            }
            cur=cur.next;
        }
        if(bs==null){
            return as;
        }
        be.next=as;
        if(as!=null){
            ae.next=null;
        }
        return bs;
    }
}
