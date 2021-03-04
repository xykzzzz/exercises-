package fuxi;

public class DD {
    //跳跃游戏
    public boolean canJump(int[] nums) {
        int[] index=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i]=i+nums[i];
        }
        int max_index=index[0];
        int jump=0;
        while (jump<index.length&&jump<=max_index){
            if(index[jump]>max_index){
                max_index=index[jump];
            }
            jump++;
        }
        if(jump==index.length){
            return true;
        }
        return false;
    }
}
