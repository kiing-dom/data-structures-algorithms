

package arrays_strings.lc334_increasing_triplet_subsequence;

/** * Given an integer array nums, return true if there exists a triple of indices 
 * (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k].  
 * If no such indices exists, return false.
 */
public class IncreasingTriplet {
    
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int num: nums) {
            if(num <= first) {
                first = num;
            } else if(num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTriplet it = new IncreasingTriplet();
        /* LeetCode Example Tests */
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(it.increasingTriplet(nums)); 

        int[] nums2 = {5, 4, 3, 2, 1};
        System.out.println(it.increasingTriplet(nums2));

        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println(it.increasingTriplet(nums3));
        
        /* Edge Case 1 (Empty Array) - Expected Output: false */
        int[] nums4 = {};
        System.out.println(it.increasingTriplet(nums4));

        /* Edge Case 2 (Array of Length < 3) - Expected Output: false */
        int[] nums5 = {1, 2};
        System.out.println(it.increasingTriplet(nums5));

        /* Edge Case 2 (Array where elements are the same) - Expected Output: false */
        int[] nums6 = {2, 2, 2, 2, 2};
        System.out.println(it.increasingTriplet(nums6));
    }
}
