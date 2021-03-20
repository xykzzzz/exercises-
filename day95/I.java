package 链表;

public class I {
    //1->2->2->1 回文
    public boolean chkPalindrome(ListNode A) {
        if(A==null){
            return false;
        }
        if(A.next==null){
            return true;
        }
        // write code here
        ListNode fast=A;
        ListNode slow=A;
        while (fast!=null||fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode cur=slow.next;
        slow.next=null;
        while (cur!=null){
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        while (slow!=null){
            if(A.val!=slow.val){
                return false;
            }
            slow=slow.next;
            A=A.next;
        }
        return true;
    }
}
