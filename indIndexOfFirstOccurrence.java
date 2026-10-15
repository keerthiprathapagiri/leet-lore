// LeetCode 28: Find the Index of the First Occurrence in a String
// Question:
// Given two strings needle and haystack, return the index of the first
// occurrence of needle in haystack, or -1 if needle is not present.
//
// Input:
// haystack = "sadbutsad", needle = "sad"
//
// Expected Output:
// 0


class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
} 
