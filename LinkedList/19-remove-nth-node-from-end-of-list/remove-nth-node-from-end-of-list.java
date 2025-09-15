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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int cnt=0;
        if(head==null||head.next==null){
            return null;
        }
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            ListNode res=head.next;
            return res;
        }
        temp=head;
        int k=cnt-n;
        k--;
        while(k!=0){
            temp=temp.next;
            k--;
        }
        temp.next=temp.next.next;
        return head;

    }
}