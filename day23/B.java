package offer;


import java.util.ArrayList;
//{67,0,24,58}
//[58,24,0,67]
class ListNode {
         int val;
         ListNode next = null;
         ListNode(int val) {
             this.val = val;
         }
     }


public class B {
    //反转链表
    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ListNode newHead=null;
            ListNode prev=null;
            ListNode cur=listNode;
            while (cur!=null){
                ListNode curNext=cur.next;
                if(curNext==null){
                    newHead=cur;
                }
                cur.next=prev;
                prev=cur;
                cur=curNext;
            }
            ArrayList<Integer> res=new ArrayList<>();
            ListNode newCur=newHead;
            while (newCur!=null){
                res.add(newCur.val);
                newCur=newCur.next;
            }
            return res;
        }
    }
}
