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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null){
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while(head != null){
            if(head.val != val){
                ListNode node = new ListNode(head.val);
                current.next = node;
                current = current.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
