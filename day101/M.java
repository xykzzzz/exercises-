package 链表;

public class M {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur=head;
        int len=0;
        while (cur!=null){
            cur=cur.next;
            len++;
        }
        k=k%len;
        cur=head;
        while (k-1>0){
            cur=cur.next;
            k--;
        }
        ListNode slow=head;
        while (cur!=null){
            ListNode slowNet=slow.next;
            if(cur.next==null){
                slow.next=null;
            }
            slow=slowNet;
            cur=cur.next;
        }
        while (slow!=null){
            if(slow.next==null){
                slow.next=head;
                break;
            }
            slow=slow.next;
        }
        return slow;
    }
}
