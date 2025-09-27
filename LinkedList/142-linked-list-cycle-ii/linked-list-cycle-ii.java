/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode len(ListNode slow, ListNode fast) {
        // fast=fast.next;
        while(slow!=fast){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) return len(head,fast);
        }
        return null;
    }
}