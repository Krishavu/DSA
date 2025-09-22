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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode,Integer> mp =new HashMap<>();
        while(!mp.containsKey(temp)&&temp!=null){
            mp.put(temp,1);
            temp=temp.next;
        }
        return mp.containsKey(temp);
    }
}