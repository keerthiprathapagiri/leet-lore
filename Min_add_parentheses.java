// Question: Find the minimum number of parentheses to insert to make the string valid.
// Input: s = "())"
// Output: 1

import java.util.*;

class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> s1 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                s1.push(ch);
            } else {
                if (s1.empty()) {
                    count++;
                } else {
                    s1.pop();
                }
            }
        }

        return count + s1.size();
    }
}