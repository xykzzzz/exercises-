package 刷题;

public class U {
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        ListNode curA=a;
        ListNode curB=b;
        int sum=0;
        while (curA!=null||curB!=null||sum!=0){
           if(curA!=null){
               sum+=curA.val;
               curA=curA.next;
           }
           if(curB!=null){
               sum+=curB.val;
               curB=curB.next;
           }
           cur.next=new ListNode(sum%10);
           sum/=10;
           cur=cur.next;
        }
        return newHead.next;
    }
}
