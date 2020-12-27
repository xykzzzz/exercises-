package offer;

public class O {
    public ListNode ReverseList(ListNode head) {
        ListNode prev=null;
        ListNode cur=head;
        ListNode newHead=null;
        while (cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
}
