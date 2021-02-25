package fuxi;

import java.util.Arrays;

public class T {
    public static int singleNumber(int[] nums) {
        int res=nums[0];
        for (int i = 1; i < nums.length; i++) {
            res^=nums[i];
        }
       int pos=1;
        while (true){
            if((res&pos)==pos){
                break;
            }
            pos<<=1;
        }
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            if((nums[i]&pos)==pos){
                x^=nums[i];
            }
        }
        return x;
    }
    public int singleNumberS(int[] nums) {
        int seenOnce = 0, seenTwice = 0;
        for (int num : nums) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }
        return seenOnce;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{30000,500,100,30000,100,30000,100}));
    }
}
