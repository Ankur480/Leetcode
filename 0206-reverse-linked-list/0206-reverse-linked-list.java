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
    public ListNode reverseList(ListNode head) {
        ListNode Previous = null;
        ListNode Current = head;
        while(Current!=null)
        {
            ListNode Dummy = Current.next;
            Current.next = Previous;
            Previous = Current;
            Current = Dummy;
        }

        return Previous;   
    }
}