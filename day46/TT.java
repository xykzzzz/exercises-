package offer;



public class TT {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null||pHead.next==null) return null;
        ListNode fast=pHead;
        ListNode slow=pHead;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
               break;
            }
        }
        fast=pHead;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
