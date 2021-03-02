package fuxi;

public class BB {
    static final   int begin=0;
    static final  int up=1;
    static final  int down=2;
    public int wiggleMaxLength(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int state=begin;
        int maxLength=1;
        for (int i = 1; i < nums.length; i++) {
            switch (state){
                case begin:
                    if(nums[i-1]<nums[i]){
                        state=up;
                        maxLength++;
                    }else if(nums[i-1]>nums[i]){
                        state=down;
                        maxLength++;
                    }
                    break;
                case up:
                    if(nums[i-1]>nums[i]){
                        state=down;
                        maxLength++;
                    }
                    break;
                case down:
                    if(nums[i-1]<nums[i]){
                        state=up;
                        maxLength++;
                    }
                    break;
            }
        }
        return maxLength;
    }
}
