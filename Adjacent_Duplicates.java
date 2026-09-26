// Question: Write a Java program using a Stack to remove adjacent 
// duplicate characters from a string.
// Input: abba
// Expected Output: Empty Stack

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "abba";
        Stack<Character> s1 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!s1.empty()) {
                if (s.charAt(i) == s1.peek())
                    s1.pop();
                else
                    s1.push(s.charAt(i));
            } else {
                s1.push(s.charAt(i));
            }
        }

        if (s1.empty())
            System.out.print("Empty Stack");
        else
            System.out.println(s1);
    }
}