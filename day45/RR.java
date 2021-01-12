package offer;


import java.util.LinkedList;
import java.util.List;

public class RR {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1){
            return -1;
        }
        List<Integer> list=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int i=0;
        while (list.size()!=1){
            i=(i+m-1)%list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}
