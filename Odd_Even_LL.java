//Leetcode Problem: 328. Odd Even Linked List
// Question: Group Odd Even Nodes
// Operations: Separate odd-indexed and even-indexed nodes, preserve their order, and merge both groups.
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenhead;
        return head;
    }
}
