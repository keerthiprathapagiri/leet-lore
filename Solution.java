// Leetcode = 142
// Input: head = [3,2,0,-4], pos = 1
// Output: tail connects to node index 1
// Explanation: There is a cycle in the linked list, where tail connects to the second node.
// Input: head = [1], pos = -1
// Output: no cycle
// Explanation: There is no cycle in the linked list.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode f=head;
                ListNode s=slow;
                while(f!=s){
                f=f.next;
                s=s.next;
                }
                
                return s;
                
            }
        }
        return null;
        
    }
}
 
