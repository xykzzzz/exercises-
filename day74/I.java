package fuxi;

public class I {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m - 1;
        int l2 = n - 1;
        int l = m + n - 1;
        while (l1 >= 0 && l2 >= 0) {
            nums1[l--] = nums1[l1] > nums2[l2] ? nums1[l1--] : nums2[l2--];
        }
        for (int i = 0; i <= l2; i++) {
            nums1[i] = nums2[i];
        }
    }
}
