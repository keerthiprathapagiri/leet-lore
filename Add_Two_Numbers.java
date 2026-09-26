//Leetcode:2
// Question: Add Two Numbers
// Operations: Traverse both linked lists, add corresponding digits, handle carry, and create the result linked list.

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode Res = new ListNode();
        ListNode dummy = Res;
        int sum = 0;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int n = sum % 10;
            Res.next = new ListNode(n);
            Res = Res.next;
            carry = sum / 10;
        }

        return dummy.next;
    }
}
