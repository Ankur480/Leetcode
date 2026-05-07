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
        ListNode Fast = head;
        ListNode Slow = head;
        ListNode Prev = null; 
        if(head==null || head.next==null) return null;
        while(Fast!=null && Fast.next!=null)
        {
            Prev = Slow;
            Slow = Slow.next;
            Fast = Fast.next.next;
        }
        Prev.next = Slow.next;
        return head;
    }
}