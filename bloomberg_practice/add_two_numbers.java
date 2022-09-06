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
        
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        int carry = 0;
        
        while(l1 != null || l2 != null){
            
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            
            int sum = n1 + n2 + carry;
            
            carry = sum / 10;
            
            ListNode node = new ListNode(sum % 10);
            current.next = node;
            current = current.next;
            
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        
        if(carry == 1){
            ListNode node = new ListNode(1);
            current.next = node;
        }
        
        return dummy.next;
        
    }
}
