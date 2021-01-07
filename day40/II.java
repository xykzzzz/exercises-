package offer;

public class II {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode pl=pHead1;
        ListNode ps=pHead2;
        int len1=0;
        int len2=0;
        while (pl!=null){
            pl=pl.next;
            len1++;
        }
        while (ps!=null){
            ps=ps.next;
            len2++;
        }
        pl=pHead1;
        ps=pHead2;
        int len=len1-len2;
        if(len<0){
            pl=pHead2;
            ps=pHead1;
            len=len2-len1;
        }
        while (len>0){
            pl=pl.next;
            len--;
        }
        while (pl != null && ps != null && pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        if(pl == ps && pl != null) {
            return pl;
        }
        return null;
    }
}
