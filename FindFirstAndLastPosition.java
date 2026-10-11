
/*
Leetcode 3
Problem: Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order,
find the starting and ending positions of a given target value.

If target is not found, return [-1, -1].

The algorithm must run in O(log n) time complexity.

Example 1:
Input: nums = [5, 7, 7, 8, 8, 10], target = 8
Output: [3, 4]

Example 2:
Input: nums = [5, 7, 7, 8, 8, 10], target = 6
Output: [-1, -1]

Example 3:
Input: nums = [], target = 0
Output: [-1, -1]

Constraints:
0 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
nums is sorted in non-decreasing order.
-10^9 <= target <= 10^9

Approach:
Use binary search twice:
1. Find the first occurrence of target.
2. Find the last occurrence of target.

Time Complexity: O(log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        System.out.println(Arrays.toString(
            sol.searchRange(nums1, target1)
        )); // Output: [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        System.out.println(Arrays.toString(
            sol.searchRange(nums2, target2)
        )); // Output: [-1, -1]

        int[] nums3 = {};
        int target3 = 0;
        System.out.println(Arrays.toString(
            sol.searchRange(nums3, target3)
        )); // Output: [-1, -1]
    }
}

