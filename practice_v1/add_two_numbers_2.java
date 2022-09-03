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
    
    public ListNode reverseList(ListNode head){
        
       if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = null, current = head, next = head.next;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
            return l2;
        }
        
        if(l2 == null){
            return l1;
        }
        
        if(l1 == null && l2 == null){
            return null;
        }

        ListNode h1 = l1;
        ListNode h2 = l2;
        
        l1 = reverseList(h1);
        l2 = reverseList(h2);
        
        int carry = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        
        while(l1 != null || l2 != null){
           
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int sum = n1 + n2 + carry;
            ListNode node = new ListNode(sum%10);
            current.next = node;
            current = current.next;
            carry = sum /10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        
        if(carry == 1){
            ListNode node = new ListNode(carry);
            current.next = node;
        }
        ListNode head = reverseList(dummy.next);
        return head;
        
    }
}
