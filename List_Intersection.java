// Question: Find the intersection node of two singly linked lists.
// Operations: Create two linked lists, compare node references, and find the common node.
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode first=headA;
       ListNode second=headB;
       while(first!=second){
        if(first!=null){
            first=first.next;
        }
        else{
            first=headB;
        }
        if(second!=null){
            second=second.next;
        }
        else{
            second=headA;
        }
       }
       return first;
    
    }
}