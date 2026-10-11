
/*
Leetcode 26
Problem: Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order,
remove duplicates in-place so that each unique element appears
only once. Keep the relative order of the elements unchanged.

Return k, the number of unique elements.

The first k elements of nums must contain the unique elements
in sorted order. Elements beyond index k - 1 can be ignored.

Example 1:
Input: nums = [1, 1, 2]
Output: k = 2, nums = [1, 2, _]

Example 2:
Input: nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
Output: k = 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]

Constraints:
1 <= nums.length <= 3 * 10^4
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.

Approach:
1. Initialize k = 1.
2. Traverse the array from index 1.
3. If the current element differs from the previous element,
   copy it to nums[k] and increment k.
4. Return k.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {

    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 1, 2};
        int k1 = sol.removeDuplicates(nums1);

        System.out.println("k = " + k1);
        System.out.println("Unique elements: "
                + Arrays.toString(Arrays.copyOf(nums1, k1)));
        // Output:
        // k = 2
        // Unique elements: [1, 2]

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k2 = sol.removeDuplicates(nums2);

        System.out.println("k = " + k2);
        System.out.println("Unique elements: "
                + Arrays.toString(Arrays.copyOf(nums2, k2)));
        // Output:
        // k = 5
        // Unique elements: [0, 1, 2, 3, 4]
    }
}
