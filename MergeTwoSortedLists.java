// LeetCode 21: Merge Two Sorted Lists
// Question:
// You are given the heads of two sorted linked lists.
// Merge the two lists into one sorted list by splicing together
// the nodes of the first two lists and return the head.
//
// Input:
// list1 = [1,2,4], list2 = [1,3,4]
//
// Expected Output:
// [1,1,2,3,4,4]


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return dummy.next;
    }
}