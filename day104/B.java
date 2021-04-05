package aa;

import java.util.HashSet;
import java.util.Set;

public class B {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int res=-1;
        for (int x:nums) {
            if(!set.add(x)){
                res=x;
                break;
            }
        }
        return res;
    }
}
