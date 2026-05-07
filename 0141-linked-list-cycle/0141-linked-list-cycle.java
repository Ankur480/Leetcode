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

        if(head==null) return false;
        ListNode Fast = head;
        ListNode Slow = head;
        while(Fast != null && Fast.next != null)
        {
            Slow = Slow.next;
            Fast = Fast.next.next;
            if(Slow == Fast) return true;
        }

        return false;
    }
}