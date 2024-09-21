package binary_search.lc162_find_peak_element;

public class FindPeak {
    /*
     * A peak element is an element that is strictly greater than its neighbors.
     * 
     * Given a 0-indexed integer array nums, find a peak element, and return its
     * index. If the array contains multiple peaks, return the index to any of the
     * peaks.
     * 
     * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is
     * always considered to be strictly greater than a neighbor that is outside the
     * array.
     * 
     * You must write an algorithm that runs in O(log n) time.
     */
    public int findPeakElement(int[] nums) {
        
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
    
    /*
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */

    public static void main(String[] args) {
        FindPeak fp = new FindPeak();
        String output = "Output: ";

        int[] nums1 = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(output + fp.findPeakElement(nums1));
    }
}