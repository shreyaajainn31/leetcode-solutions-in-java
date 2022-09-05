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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode c1 = head, c2 = head.next;
        
        while(c1 != null && c2 != null){
            if(c1.val == c2.val){
                while(c2 != null && c1.val == c2.val){
                    c2 = c2.next;
                }
                c1.next = c2;
                if(c2 == null){
                    return head;
                } 
            }
            c1 = c1.next;
            c2 = c2.next;
        }
        
        return head;
        
    }
}
