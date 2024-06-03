package leetcode;

// Median of Two Sorted Arrays
public class Question4 {
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length, idx = 0, p1 = 0, p2 = 0, m1 = 0, m2 = 0;

        while (idx <= (n1 + n2) / 2) {
            m1 = m2;
            if (p1 < n1 && (p2 >= n2 || nums1[p1] <= nums2[p2])) {
                m2 = nums1[p1];
                p1++;
            } else {
                m2 = nums2[p2];
                p2++;
            }
            idx++;
        }
        return ((n1 + n2) % 2 != 0) ? m2 : ((double) (m1 + m2) / 2);
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 3 }, nums2 = { 2 };
        // int[] nums1 = { 1, 2 }, nums2 = { 3, 4, };
        int[] nums1 = { 2 }, nums2 = { 0 };
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
