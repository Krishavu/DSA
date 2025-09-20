/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode q1=head;
        ListNode p1=null;

        while(head!=null&& head.next!=null){
            head=head.next.next;
            slow=slow.next;
            q1.next=p1;
            p1=q1;
            q1=slow;
        }

        if(head!=null){
            slow=slow.next;
        }

        while(p1!=null&& slow!=null){
            if(slow.val!=p1.val) return false;
            slow=slow.next;
            p1=p1.next;
        }
        return true;
    }
}