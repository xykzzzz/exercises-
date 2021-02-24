package fuxi;

import java.util.*;

public class Q {
    public static int thirdMax(int[] nums) {
      TreeSet<Integer> set=new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if(set.size()>3){
                set.remove(set.first());
            }
        }
        return set.size()<3?set.last():set.first();
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2,-2147483648}));
    }
}
