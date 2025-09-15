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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int cnt=0;

        if(head==null){
            return head;
        }
        if(head.next==null){
            head=null;
            return head;
        }
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int n=cnt/2;
        ListNode temp2=head;
        int k=0;
        while(k!=n-1){
            temp2=temp2.next;
            k++;
        }
        temp2.next=temp2.next.next;
        return head;
    }
}