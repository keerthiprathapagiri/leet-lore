
/*
Problem: 15. 3Sum

Given an integer array nums, return all triplets [nums[i], nums[j],
nums[k]] such that:
1. i != j, i != k, and j != k.
2. nums[i] + nums[j] + nums[k] == 0.

The solution must not contain duplicate triplets.

Example 1:
Input: nums = [-1, 0, 1, 2, -1, -4]
Output: [[-1, -1, 2], [-1, 0, 1]]

Example 2:
Input: nums = [0, 1, 1]
Output: []

Example 3:
Input: nums = [0, 0, 0]
Output: [[0, 0, 0]]

Constraints:
3 <= nums.length <= 3000

Approach:
1. Sort the array.
2. Fix one element and use two pointers (left and right).
3. If the sum is zero, add the triplet to the result.
4. Skip duplicate elements to avoid duplicate triplets.

Time Complexity: O(n^2)
Space Complexity: O(n) for the result, excluding sorting space.
*/

import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] > 0) {
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println(sol.threeSum(nums1));
        // Output: [[-1, -1, 2], [-1, 0, 1]]

        int[] nums2 = {0, 1, 1};
        System.out.println(sol.threeSum(nums2));
        // Output: []

        int[] nums3 = {0, 0, 0};
        System.out.println(sol.threeSum(nums3));
        // Output: [[0, 0, 0]]
    }
}

