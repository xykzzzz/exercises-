package fuxi;

import java.util.Arrays;

public class O {
    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (2 * leftSum + nums[i] == totalSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
