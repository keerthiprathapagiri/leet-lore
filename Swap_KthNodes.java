//leetcode : 1721
// Question: Swap Kth Nodes
// Operations: Find the kth node from the beginning, find the kth node from the end, and swap their values.

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode f = head;
        for (int i = 1; i < k; i++)
            f = f.next;

        ListNode c = f;
        ListNode l = head;

        while (c.next != null) {
            c = c.next;
            l = l.next;
        }

        int temp = f.val;
        f.val = l.val;
        l.val = temp;

        return head;
    }
}