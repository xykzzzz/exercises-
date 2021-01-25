package fuxi;

import java.util.Arrays;

public class L2 {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int []temp=new int[nums.length];
            for (int i = 0; i < n; ++i) {
                temp[(i + k) % n] = nums[i];
            }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a={-1};
        rotate(a,2);
    }
}
