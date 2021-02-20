package fuxi;

import java.util.HashMap;
import java.util.Map;

public class D {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],(map.getOrDefault(nums[i],0)+1));
        }
        int maxCount=0;
        for (Map.Entry<Integer,Integer> e:map.entrySet()) {
            int key = e.getKey();
            int value=e.getValue();
            if(maxCount<value){
                maxCount=value;
            }
        }
        int left=0;
        int right=0;
        int res=n;
        int []temp=new int[50000];
       while (right<n){
           temp[nums[right]]++;
           if(temp[nums[right]]==maxCount){
               while (nums[left]!=nums[right]){
                   temp[nums[left]]--;
                   left++;
               }
               res=Math.min(res,right-left+1);
           }
           right++;
       }
       return res;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4,3};
        System.out.println(findShortestSubArray(nums));
    }
}
