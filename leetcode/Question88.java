//88. Merge Sorted Array
package leetcode;

import java.util.Arrays;

public class Question88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = 0;
        int element = 0;
        for (int i = 0; i < nums2.length; i++) {
            // System.out.println(nums2[i]);
            element = nums2[i];
            for (int j = 0; j < nums1.length; j++) {
                if (element <= nums1[j]) {
                    temp = element;
                    element = nums1[j];
                    nums1[j] = temp;
                } else if (nums1[j] == 0 && j > m  && nums1[j] != 0) {
                    nums1[j] = element;
                } else {
                    nums1[m+i] = element;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;
        // int[] nums2 = { 2, 5, 6 };
        // int n = 3;

        // int[] nums1 = { 1, 2, 4, 5, 6, 0 };
        // int m = 5;
        // int[] nums2 = { 3 };
        // int n = 1;

        // int[] nums1 = { -1,0,0,3,3,3,0,0,0 };
        // int m = 6;
        // int[] nums2 = { 1,2,2 };
        // int n = 3;

        // int[] nums1 = { -1,3,0,0,0,0,0 };
        // int m = 2;
        // int[] nums2 = { 0,0,1,2,3 };
        // int n = 5;

        // int[] nums1 = { -1,0,0,0,3,0,0,0,0,0,0 };
        // int m = 5;
        // int[] nums2 = { -1,-1,0,0,1,2 };
        // int n = 6;

        int[] nums1 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
        int m = 0;
        int[] nums2 = { -50,-50,-48,-47,-44,-44,-37,-35,-35,-32,-32,-31,-29,-29,-28,-26,-24,-23,-23,-21,-20,-19,-17,-15,-14,-12,-12,-11,-10,-9,-8,-5,-2,-2,1,1,3,4,4,7,7,7,9,10,11,12,14,16,17,18,21,21,24,31,33,34,35,36,41,41,46,48,48 };
        int n = 63;
        merge(nums1, m, nums2, n);
    }
}
