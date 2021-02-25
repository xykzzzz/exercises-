package fuxi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class U {
    public static int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0){
            return new int[]{-1,-1};
        }
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
            if(map.containsKey(target)){
                count=map.get(target);
            }
        }
        if(count==0){
            return new int[]{-1,-1};
        }else {
            for (int i = 0; i < nums.length; i++) {
                if(target==nums[i]){
                    index=i;
                    break;
                }
            }
            return new int[]{index,index+count-1};
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
    }
}
