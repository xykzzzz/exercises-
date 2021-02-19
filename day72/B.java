package fuxi;



import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class B {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        HashSet<Integer> set=new HashSet<>();
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        while (head!=null){
            set.add(head.val);
            head=head.next;
        }
        List<Integer> list=new LinkedList<>(set);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            cur.next=new ListNode(list.get(i));
            cur=cur.next;
        }
        return newHead.next;
    }
}
