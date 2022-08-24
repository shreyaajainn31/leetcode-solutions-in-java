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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode l1 = list1, l2 = list2;
        if(l2 == null){
            return l1;
        }
        if(l1 == null){
            return l2;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        while(l1 != null && l2 != null){
            
            if(l1.val < l2.val){
                ListNode node = new ListNode(l1.val);
                current.next = node;
                l1 = l1.next;
            }
            else{
                ListNode node = new ListNode(l2.val);
                current.next = node;
                l2 = l2.next;
            }

            current = current.next;
        }
        
        if(l1 != null){
            current.next = l1;
        }
        else if(l2 != null){
            current.next = l2;
        }
        
        return dummy.next;
    }
}
