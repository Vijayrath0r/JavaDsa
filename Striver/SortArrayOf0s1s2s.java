package Striver;

import java.util.Arrays;

public class SortArrayOf0s1s2s {
    public static void sortColors(int[] nums) {
        int zerosPlace = 0;
        int onesPlace = 0;
        int twosPlace = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                zerosPlace++;
            } else if (nums[i]==1){
                onesPlace++;
            } else if (nums[i]==2){
                twosPlace++;
                
            } 
        }
        for (int i = 0; i < nums.length; i++) {
            if (zerosPlace>0) {
                nums[i]=0;
                zerosPlace--;
            } else if(onesPlace>0){
                nums[i]=1;
                onesPlace--;
            } else if(twosPlace>0){
                nums[i]=2;
                twosPlace--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        System.out.println(Arrays.toString(nums));
        sortColors(nums);
    }

}
