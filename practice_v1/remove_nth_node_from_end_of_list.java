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
    
    public int length(ListNode l){
        
        int count = 0;
        
        while(l !=null){
            count++;
            l = l.next;
        }
        
        return count;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null){
            return null;
        }
    
        int l1 = length(head);
        
        if(l1 == n){
            return head.next;
        }
        ListNode l = head;
        for(int i =0; i<l1 - n-1; i++){
            l = l.next;
        }
        
        if(l.next.next == null){
            l.next = null;
        }
        else{
            l.next = l.next.next;
        }
        
        return head;
    }
}
