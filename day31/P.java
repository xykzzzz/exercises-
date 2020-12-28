package offer;

public class P {
    //输入两个单调递增的链表，输出两个链表合成后的链表，
    // 当然我们需要合成后的链表满足单调不减规则
    //{1,3,5},{2,4,6}
    //{1,2,3,4,5,6}
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode newNode=new ListNode(-1);
        ListNode temp=newNode;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                temp.next=list1;
                temp=temp.next;
                list1=list1.next;
            }else {
                temp.next=list2;
                temp=temp.next;
                list2=list2.next;
            }
        }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
        }
        return newNode.next;
    }
}
