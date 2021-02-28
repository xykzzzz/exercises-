package fuxi;

public class X {
    public static int findUnsortedSubarray(int[] nums) {
     int l=nums.length;
     int r=0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]>nums[j]){
                    l=Math.min(l,i);
                    r=Math.max(r,j);
                }
            }
        }
        return Math.max(r - l + 1, 0);
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
    }
}
