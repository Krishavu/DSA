/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        HashMap<ListNode , Integer> mp= new HashMap<>();
        while(tempA!=null){
            mp.put(tempA,1);
            tempA=tempA.next;
        }
        while(tempB!=null){
            if(mp.containsKey(tempB)){
                return tempB;
            }
            tempB=tempB.next;
        }
        return null;
    }
}