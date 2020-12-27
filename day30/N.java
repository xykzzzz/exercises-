package offer;

public class N {
//输入一个链表，输出该链表中倒数第k个结点
      public  ListNode FindKthToTail(ListNode head, int k) {
          ListNode fast=head;
          ListNode slow=head;
          if(k<=0||head==null){
              return null;
          }
          while (k-1>0){
              if(fast.next!=null) {
                  fast = fast.next;
                  k--;
              }else {
                  return null;
              }
          }
          while (fast.next!=null){
              slow=slow.next;
              fast=fast.next;
          }
          return slow;
}


}
