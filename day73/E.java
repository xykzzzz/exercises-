package fuxi;

import java.math.BigDecimal;

public class E {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1.val==0&&l2.val==0){
            return new ListNode(0);
        }
        ListNode cur1=l1;
        StringBuilder num1 = new StringBuilder();
        ListNode cur2=l2;
        long res2=0;
        while (cur1!=null){
            num1.append(cur1.val);
            cur1=cur1.next;
        }
        num1 = new StringBuilder(new StringBuffer(num1.toString()).reverse().toString());
        StringBuilder num2 = new StringBuilder();
        while (cur2!=null){
            num2.append(cur2.val);
            cur2=cur2.next;
        }
        num2 = new StringBuilder(new StringBuffer(num2.toString()).reverse().toString());
        BigDecimal sum = new BigDecimal(num1.toString()).add(new BigDecimal(num2.toString()));
        String s = sum.toString();
        ListNode l3 = new ListNode(0);
        ListNode result = null;
        for (int i = s.length() - 1; i > -1; i--) {
            l3.next = new ListNode(Integer.valueOf("" + s.charAt(i)));
            l3 = l3.next;
            if (result == null) {
                result = l3;
            }
        }
        return result;
    }
}
