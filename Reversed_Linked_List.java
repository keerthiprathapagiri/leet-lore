// Leetcode = 206
// Given the head of a singly linked list, reverse the list, and return the reversed list.
// Input: head = [1,2,3,4,5]
// Output: [5,4,3,2,1]
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode fur=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fur;
        }
        return prev;
    }
}