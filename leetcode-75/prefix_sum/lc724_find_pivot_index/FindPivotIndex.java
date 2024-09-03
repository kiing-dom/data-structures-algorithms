package prefix_sum.lc724_find_pivot_index;

public class FindPivotIndex {
    /*
     * Given an array of integers `nums`
     * calculate the pivot index of this array
     * 
     * the pivot index is the index where the sum of all the numbers, strictly to
     * the left,
     * is equal to the sum of all te number's strictly to the index's right
     * 
     * if the index is on the left edge of the array, then the left sum is 0,
     * because there
     * are no elements to the left
     * This also applies to the right edge of the array
     * 
     * return the leftmost pivot index. if no such index exists, return -1
     */
    public int pivotIndex(int[] nums) {
        /*
         * get the total sum of the array first
         * initialise a variable for the left sum
         * calculate the right sum (total sum - left sum - nums[i])
         * 
         * if the left sum and right sum are equal, return the index `i`
         * else return -1
         */

        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        int leftSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if(rightSum == leftSum) {
                return i;
            }
            
            leftSum += nums[i];
        }

        return -1;
    }
}