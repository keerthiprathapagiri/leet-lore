//Leetcode=27
// Question: Remove Element
// Operations: Traverse the array, remove all occurrences of val in-place, and return the count of remaining elements.
// Sample Input: nums = [3,2,2,3], val = 3
// Sample Output: k = 2, nums = [2,2,_,_]

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}