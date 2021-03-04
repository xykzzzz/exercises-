package fuxi;

public class EE {
    //跳跃游戏进阶
    public int jump(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int current_max_index=nums[0];
        int pre_max_max_index=nums[0];
        int jump_min=1;
        for (int i = 1 ; i < nums.length; i++) {
            if(current_max_index<i){
                jump_min++;
                current_max_index=pre_max_max_index;
            }
            if(pre_max_max_index<nums[i]+i){
                pre_max_max_index=nums[i]+i;
            }
        }
        return jump_min;
    }
}
