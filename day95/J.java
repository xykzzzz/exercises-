package 链表;

public class J {
    //，找到两个单链表相交的起始节点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA=headA;
        int lenA=0;
        ListNode curB=headB;
        int lenB=0;
        while (curA!=null){
            lenA++;
            curA=curA.next;
        }
        while (curB!=null){
            lenB++;
            curB=curB.next;
        }
        curA=headA;
        curB=headB;
        int len=lenA-lenB;
        if(len>0){
            while (len>0&&curA!=null){
                curA=curA.next;
                len--;
            }
        }else {
            len=-len;
            while (len>0&&curB!=null){
                curB=curB.next;
                len--;
            }
        }
        while (curA!=null&&curB!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
