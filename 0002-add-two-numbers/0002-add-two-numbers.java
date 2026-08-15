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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(ptr1 != null || ptr2!= null || carry!=0)
        {
            int sum = carry;

            if(ptr1!=null)
            {
                sum+= ptr1.val;
                ptr1 = ptr1.next;
            }

            if(ptr2!=null)
            {
                sum+= ptr2.val;
                ptr2 = ptr2.next;
            }

            int digit = sum % 10;
            carry = sum / 10;

            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummy.next;
    }
}