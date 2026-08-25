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
        int s1 = 0, s2 = 0;
        for (ListNode node = l1; node != null; node = node.next) s1++;
        for (ListNode node = l2; node != null; node = node.next) s2++;
        
        if (s1 < s2) {
            int s = s1;
            s1 = s2;
            s2 = s;
            ListNode l = l1;
            l1 = l2;
            l2 = l;
        }
        
        ListNode result = null;
        for (int i = 0; i < s1 - s2; i++) {
            result = new ListNode(l1.val, result);
            l1 = l1.next;
        }
        
        for (int i = 0; i < s2; i++) {
            result = new ListNode(l1.val + l2.val, result);
            l1 = l1.next;
            l2 = l2.next;
        }
        
        int carry = 0;
        ListNode node = result;
        result = null;
        while (node != null) {
            int r = node.val + carry;
            if (r >= 10) {
                r = r - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            node.val = r;
            ListNode temp = node.next;
            node.next = result;
            result = node;
            node = temp;
        }
        
        if (carry > 0) {
            result = new ListNode(carry, result);
        }
        
        return result;
    }
}