package fuxi;

import java.util.Map;
import java.util.TreeMap;

public class R {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numToIndex=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int x=target-nums[i];
            if(numToIndex.containsKey(x)){
                int odx=numToIndex.get(x);
                return new int[]{odx,i};
            }
            numToIndex.put(n,i);
        }
        return null;
    }
}
