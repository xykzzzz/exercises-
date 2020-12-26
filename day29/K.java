package offer;


 class ListNode {
    int val;
    ListNode next = null;

     public ListNode(int val) {
         this.val = val;
     }
 }
public class K {
    public ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        // write code here
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode newList=null;
        int sum=l1.val+l2.val;
        if(sum>10){
            sum=sum%10;
            newList=new ListNode(sum);
            newList.next=addTwoNumbers(l1.next,l2.next);
        }else {
            newList=new ListNode(sum);
            newList.next=addTwoNumbers(l1.next,l2.next);
        }
        return newList;
    }
}
