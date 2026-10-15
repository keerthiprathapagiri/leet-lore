// LeetCode 66: Plus One
// Question:
// You are given a large integer represented as an integer array digits.
// Increment the large integer by one and return the resulting array of digits.
//
// Input:
// digits = [1,2,3]
//
// Expected Output:
// [1,2,4]


import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;

        System.out.println(Arrays.toString(res));
    }
}