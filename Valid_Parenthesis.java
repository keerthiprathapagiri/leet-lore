// Question: Check if brackets are valid using a stack.
// Input: s = "([])"
// Output: true

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                s1.push(ch);
            } else {
                if (s1.empty()) {
                    return false;
                }

                char top = s1.peek();

                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;

                s1.pop();
            }
        }

        return s1.empty();
    }
}