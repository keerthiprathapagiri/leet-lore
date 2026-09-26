// Question: Find the winner of the circular game.
// Input: n = 5, k = 2
// Output: 3

import java.util.*;

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            q1.offer(i);
        }

        while (q1.size() > 1) {
            for (int i = 1; i < k; i++) {
                q1.offer(q1.poll());
            }
            q1.poll();
        }

        return q1.peek();
    }
}
