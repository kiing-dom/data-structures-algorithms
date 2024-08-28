package two_pointers.lc283_move_zeroes;

import java.util.Arrays;

public class MoveZeroes {
    /*
     * Given an integer array 'nums'
     *  move all 0s to the end of it
     *  while maintaining the relative order of the non-zero elements
     * 
     * Note: you must do this in place without making a copy of the array
     */

     public void moveZeroes(int[] nums) {
        /*
         * have a left pointer and a right pointer: l, r
         * if l = 0 and right isnt 0, swap them
         * this should take place in a while loop
         */

         int left = 0;
         for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
         }
    }

     //define a swap funtion
     private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
     }

     public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        /* Example 1 - returns: [1, 3, 12, 0, 0] */
        int[] nums = {0, 1, 0, 3, 12};
        mz.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        /* Example 2 - returns: [0] */
        int[] nums2 = {0};
        mz.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2));

        /* Edge Case 1: Empty Array - returns: [] */
        int[] nums3 = {};
        mz.moveZeroes(nums3);
        System.out.println(Arrays.toString(nums3));

        
     }
}
