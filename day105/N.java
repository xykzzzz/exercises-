package 链表;

public class N {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newFakeHead=new ListNode(-1);
        newFakeHead.next=head;
        int len=getLength(head);
        ListNode cur=newFakeHead;
        for (int i = 1; i <len-n+1 ; i++) {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return newFakeHead.next;
    }

    private int getLength(ListNode head) {
        int len=0;
        while (head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}
